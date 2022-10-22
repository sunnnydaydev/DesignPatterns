package pattern_proxy;

import pattern_proxy.auto_proxy.PressProxyHandler;
import pattern_proxy.static_proxy.Press;
import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * Create by SunnyDay on 2019/04/14
 */
public class Test {
    public static void main(String[] args) {
        PressProxyHandler handler = new PressProxyHandler(new Press());
        Subject press = (Subject) Proxy.newProxyInstance(Press.class.getClassLoader(), Press.class.getInterfaces(), handler);
        press.sailBook();
    }
}
