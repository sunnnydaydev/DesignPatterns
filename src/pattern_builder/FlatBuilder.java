package pattern_builder;

/**
 * Create by SunnyDay on 2019/03/03
 */
public class FlatBuilder implements HouseBuilder {
    private  House house = new House();
    @Override
    public HouseBuilder makeFloor() {
        house.setFloor("公寓地板");
        return this;
    }

    @Override
    public HouseBuilder makeWall() {
     house.setWall("公寓墙");
        return this;
    }

    @Override
    public HouseBuilder makeRoof() {
        house.setRoof("公寓屋顶");
        return this;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
