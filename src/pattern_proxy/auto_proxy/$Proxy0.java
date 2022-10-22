package pattern_proxy.auto_proxy;

import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by SunnyDay 2022/10/22 21:05:36
 **/

public final class $Proxy0 extends Proxy implements Subject {
    private static Method m3;

    static {
        m3 = Class.forName("pattern_proxy.static_proxy.Subject").getMethod("sailBook", new Class[0]);
    }

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    public final void sailBook() {
            this.h.invoke(this, m3, null);
    }
}
