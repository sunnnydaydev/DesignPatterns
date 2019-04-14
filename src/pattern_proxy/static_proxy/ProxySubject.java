package pattern_proxy.static_proxy;

/**
 * Create by SunnyDay on 2019/04/14
 * 代理类
 */
public class ProxySubject implements Subject {
    private Subject subject;//传被代理类对象引用

    //这里使用setter也行，不一定使用构造
    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * 代理卖书功能，自己还做点功能。
     */
    @Override
    public void sailBook() {
        dazhe();
        subject.sailBook();
        give();

    }

    private void dazhe() {
        System.out.println("卖书吗？书打折");
    }

    private void give() {
        System.out.println("给你代金券");
    }
}
