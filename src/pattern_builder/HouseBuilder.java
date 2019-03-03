package pattern_builder;

/**
 * Create by SunnyDay on 2019/03/03
 *
 * 房子建造者(由实现类实现不同的建造者)
 *
 */
public interface HouseBuilder {
    void makeFloor();
    void makeWall();
    void makeRoof();
    House getHouse();//  Product
}
