package pattern_proxy.static_proxy;

/**
 * Create by SunnyDay on 2019/04/14
 * 代理类
 */
public class ProxySubject implements Subject {
    private  Subject subject;

    public ProxySubject() {

    }

    /**
     * 代理卖书功能，自己还做点功能。
     */
    @Override
    public void sailBook() {
        subject = new Press();
        discount();
        subject.sailBook();
        give();
    }

    /**
     * 打折
     * */
    private void discount() {
        System.out.println("打折券一张");
    }
    /**
     * 赠品
     * */
    private void give() {
        System.out.println("买书赠品一个");
    }
}
