package pattern_decorator.car;

/**
 * Create by SunnyDay on 2019/04/07
 * 装饰者:黑车膜的奥迪
 */
public class DecoratorAudiA8CarSkinBlack extends Decorator {

    public DecoratorAudiA8CarSkinBlack(IVolkswagen iCar) {
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
        System.out.println("奥迪A8L：80.5W");
    }
}
