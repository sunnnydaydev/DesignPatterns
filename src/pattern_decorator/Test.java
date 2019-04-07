package pattern_decorator;

/**
 * Create by SunnyDay on 2019/04/07
 */
public class Test {
    public static void main(String[] args){
        // 未进行修饰
        Car car = new Car();
        car.run();
        car.stop();
        //进行修饰
        CarWrap icar = new CarWrap(car);
        icar.run();
        icar.stop();
    }
}
/*
log：
车 在跑
刹车！！！
我的宝马 5 秒启动！！！ 6的飞起
刹车！！！
 */
