package pattern_decorator.car;

/**
 * Create by SunnyDay on 2019/04/07
 * 装饰者:黑车膜的帕萨特
 */
public class DecoratorPassat2023SkinBlack extends Decorator {

    public DecoratorPassat2023SkinBlack(IVolkswagen iCar) {
        super(iCar);
    }

    /**
     * 不需要操作的方法保持原状。
     * */
    @Override
    public void desc() {
        super.desc();
    }

    /**
     * 对需要操作的方法进行增强。
     * */
    @Override
    public void cost() {
        System.out.println("大众帕萨特:19.5W");
    }
}
