package pattern_decorator.car;

/**
 * Create by SunnyDay 2022/10/30 20:29:40
 **/
public class Passat2023 implements IVolkswagen {
    @Override
    public void desc() {
        System.out.println("大众帕萨特 2023款 280TSI 星空精英版");
    }

    @Override
    public void cost() {
        System.out.println("大众帕萨特:19w");
    }
}
