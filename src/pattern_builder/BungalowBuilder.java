package pattern_builder;

/**
 * Create by SunnyDay on 2019/03/03
 * <p>
 * 平房修建者
 */
public class BungalowBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public HouseBuilder makeFloor() {
      house.setFloor("平房地板");
      return this;
    }

    @Override
    public HouseBuilder makeWall() {
    house.setWall("平房墙");
        return this;
    }

    @Override
    public HouseBuilder makeRoof() {
     house.setRoof("平房屋顶");
        return this;
    }

    /**
     * 外界使用
     * */
    @Override
    public House getHouse() {
        return house;
    }
}
