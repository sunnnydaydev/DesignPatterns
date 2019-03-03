package pattern_builder;

/**
 * Create by SunnyDay on 2019/03/03
 */
public class FlatBuilder implements HouseBuilder {
    private  House house = new House();
    @Override
    public void makeFloor() {
        house.setFloor("公寓地板");
    }

    @Override
    public void makeWall() {
     house.setWall("公寓墙");
    }

    @Override
    public void makeRoof() {
        house.setRoof("公寓屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
