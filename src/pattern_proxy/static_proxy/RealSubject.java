package pattern_proxy.static_proxy;

/**
 * Create by SunnyDay on 2019/04/14
 * 被代理的类
 */
public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("卖书ing");
    }
}
