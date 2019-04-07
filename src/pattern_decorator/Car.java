package pattern_decorator;

/**
 * Create by SunnyDay on 2019/04/07
 * 原始类
 */
public class Car implements Icar {
    @Override
    public void run() {
        System.out.println("车 在跑");
    }

    @Override
    public void stop() {
        System.out.println("刹车！！！");
    }
}
