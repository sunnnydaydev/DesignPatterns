package pattern_proxy;

import pattern_proxy.auto_proxy.MyHandler;
import pattern_proxy.static_proxy.Press;
import pattern_proxy.static_proxy.ProxySubject;
import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * Create by SunnyDay on 2019/04/14
 */
public class Test {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new Press());
        proxySubject.sailBook();

//        MyHandler myHandler = new MyHandler(new Press());
//
//        Subject subjectProxy = (Subject) Proxy.newProxyInstance(Press.class.getClassLoader(), Press.class.getInterfaces(), myHandler);
//        subjectProxy.sailBook();
    }
}
