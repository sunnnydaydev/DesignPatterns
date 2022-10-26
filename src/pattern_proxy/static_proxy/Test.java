package pattern_proxy.static_proxy;

/**
 * Create by SunnyDay 2022/10/26 21:54:24
 **/
public class Test {
    public static void main(String[] args) {
        //代理商卖书
        Subject subject = new ProxySubject();
        subject.sailBook();
    }
}
