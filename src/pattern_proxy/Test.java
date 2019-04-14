package pattern_proxy;

import pattern_proxy.static_proxy.ProxySubject;
import pattern_proxy.static_proxy.RealSubject;

/**
 * Create by SunnyDay on 2019/04/14
 */
public class Test {
    public static void main(String[] args){
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.sailBook();
    }
}
