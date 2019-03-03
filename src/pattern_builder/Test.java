package pattern_builder;

/**
 * Create by SunnyDay on 2019/03/03
 * 测试类，用来测试我们的Builder设计模式
 */
public class Test {
    public static void main(String[] args) {
        normalMode();
        builderModeDemo();
        builderMode();
        flat();

    }

    /**
     * 普通模式（不使用设计模式时）
     * <p>
     * 客户直接修建房子
     */
    private static void normalMode() {
        House house = new House();
        house.setRoof("屋顶");
        house.setWall("墙");
        house.setFloor("地板");
        System.out.println(house.toString());

        /*
               问题：
               当用户想要 不同类型的房子如平房、公寓等等。 用户需要手动修改三个属性，才能把房子
               变成平房，或者公寓。
         */
    }

    /**
     * 使用builder模式案例
     * <p>
     * 缺点：用户还需要调用工程队（builder.makeXXX()），让工程队来修。
     */
    private static void builderModeDemo() {

        HouseBuilder builder = new BungalowBuilder();// 平房工程队
        // 工程队开始修建
        builder.makeFloor();
        builder.makeRoof();
        builder.makeWall();
        // 查看 修建的房子（产品）
        House house = builder.getHouse();//其实House类应该隐藏 不能让用户直接使用（new），通过相关的builder提供实例
        System.out.println(house.toString());

        /*
         * 缺点：用户还需要指导工程队来修，在自己查看产品
         *
         * */
    }

    /**
     * 使用builder模式
     * <p>
     * 缺点：用户还需要调用工程队（builder.makeXXX()），让工程队来修。
     */
    private static void builderMode() {

        HouseBuilder builder = new BungalowBuilder();// 平房工程队
        HouseDirector houseDirector = new HouseDirector(builder);//  设计指导师指导完成
        houseDirector.makeHouse();// 指导师干活
        // 查看 修建的房子（产品）
        House house = builder.getHouse();//其实House类应该隐藏 不能让用户直接使用（new），通过相关的builder提供实例
        System.out.println(house.toString());

        /*
         * 缺点：用户还需要指导工程队来修，在自己查看产品
         *
         * */
    }

    public static  void flat() {
        HouseBuilder builder = new FlatBuilder();
        HouseDirector director = new HouseDirector(builder);
        director.makeHouse();
        House house = builder.getHouse();
        System.out.println(house.toString());
    }
}
