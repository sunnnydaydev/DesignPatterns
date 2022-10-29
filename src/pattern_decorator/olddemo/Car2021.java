package pattern_decorator.olddemo;

/**
 * Create by SunnyDay on 2019/04/07
 */
public class Car2021 extends CarDecorator {

    public Car2021(ICar iCar) {
        super(iCar);
    }

    /**
     * 对需要操作的方法进行增强。
     * 例如2021款的，侧重于安全。点火后有安全相关的提示文案。
     * */
    @Override
    public void run() {
        super.run();
        System.out.println("汽车已启动，请司机与乘客带好安全带~");
    }

    /**
     * 不需要操作的方法保持原状。
     * */
    @Override
    public void stop() {
        super.stop();
    }
}
