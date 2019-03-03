package pattern_builder;

/**
 * Create by SunnyDay on 2019/03/03
 * <p>
 * 设计者
 * 功能：指导builder
 * 没有本类时，用户让builder工作并不能一部的到产品 还需要调用工程队修
 */
public class HouseDirector {
    // 提供builder对象引用（参看uml类图）
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 建造房子
     *
     * 让设计师指导完成
     * */
    public void makeHouse(){
        houseBuilder.makeWall();
        houseBuilder.makeRoof();
        houseBuilder.makeFloor();
    }
}
