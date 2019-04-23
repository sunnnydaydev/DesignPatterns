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
        // 行驶被代理类的功能前后同时再做点其他功能
        dazhe();
        subject.sailBook();
        give();

    }

    /**
     * 打折，代理类添加的小功能
     * */
    private void dazhe() {
        System.out.println("卖书吗？书打折");
    }
    /**
     * 送优惠券，代理类添加的小功能
     * */
    private void give() {
        System.out.println("给你代金券");
    }
}
