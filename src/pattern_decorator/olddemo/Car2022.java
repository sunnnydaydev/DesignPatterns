package pattern_decorator.olddemo;

/**
 * Create by SunnyDay at 2022/10/28 17:34:52
 */
public class Car2022 extends CarDecorator{
    public Car2022(ICar iCar) {
        super(iCar);
    }

    /**
     * 对需要操作的方法进行增强。
     * 例如2022款的，侧重用户体验。
     * */
    @Override
    public void run() {
        super.run();
        System.out.println("汽车已启动，检测到目前温度过高，已经为您智能调节到合适的温度");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
