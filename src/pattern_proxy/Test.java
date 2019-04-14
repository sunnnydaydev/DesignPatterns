package pattern_proxy;

import pattern_proxy.auto_proxy.MyHandler;
import pattern_proxy.static_proxy.ProxySubject;
import pattern_proxy.static_proxy.RealSubject;
import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * Create by SunnyDay on 2019/04/14
 */
public class Test {
    public static void main(String[] args) {
//        ProxySubject proxySubject = new ProxySubject(new RealSubject());
//        proxySubject.sailBook();
        MyHandler myHandler = new MyHandler(new RealSubject());

        Subject subjectProxy = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), myHandler);
        subjectProxy.sailBook();
    }
}
