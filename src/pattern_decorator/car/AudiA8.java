package pattern_decorator.car;

/**
 * Create by SunnyDay on 2019/04/07
 * 产品：AudiA8
 */
public class AudiA8 implements IVolkswagen {
    @Override
    public void desc() {
        System.out.println("奥迪A8L");
    }

    @Override
    public void cost() {
        System.out.println("奥迪A8L：80W");
    }
}
