package pattern_decorator.car;

/**
 * Create by SunnyDay at 2022/10/28 17:18:49
 *
 */
public abstract class Decorator implements IVolkswagen {

    protected final IVolkswagen iCar;

    public Decorator(IVolkswagen iCar) {
        this.iCar = iCar;
    }

    @Override
    public void desc() {
       iCar.desc();
    }

    @Override
    public void cost() {
        iCar.cost();
    }
}
