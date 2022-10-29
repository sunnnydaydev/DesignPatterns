package pattern_decorator.olddemo;

/**
 * Create by SunnyDay at 2022/10/28 17:18:49
 * 父类就相当于原料，这个类不能直接被使用。只能使用其子类。举个栗子：想要复制与Car同样的车，使用装饰者需要新建一个子实现类。
 */
public abstract class CarDecorator implements ICar {

    protected final ICar iCar;

    public CarDecorator(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void run() {
       iCar.run();
    }

    @Override
    public void stop() {
        iCar.stop();
    }
}
