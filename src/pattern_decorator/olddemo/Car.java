package pattern_decorator.olddemo;

/**
 * Create by SunnyDay on 2019/04/07
 * 原始类
 */
public class Car implements ICar {
    @Override
    public void run() {
        System.out.println("点火");
    }

    @Override
    public void stop() {
        System.out.println("熄火");
    }
}
