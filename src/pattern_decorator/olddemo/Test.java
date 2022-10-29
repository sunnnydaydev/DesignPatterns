package pattern_decorator.olddemo;

/**
 * Create by SunnyDay on 2019/04/07
 */
public class Test {
    public static void main(String[] args){
        // 1、直接使用类，不使用装饰者。
        Car car = new Car();
        car.run();
        car.stop();
        //目前只能操作run、stop基础功能。要想拓展功能再不修改原有的代码前提下需要进行继承来实现。这样缺点：
        //(1)扩展性差。
        //(2)容易子类爆炸

        // 2、使用装饰者,获取产品1
        ICar car2021 = new Car2021(car);
        car2021.run();
        car2021.stop();

        ICar car2022 = new Car2022(car);
        car2022.run();
        car2022.stop();

    }
}

