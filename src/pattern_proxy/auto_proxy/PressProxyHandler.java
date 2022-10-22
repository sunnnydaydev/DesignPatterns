package pattern_proxy.auto_proxy;

import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by SunnyDay on 2019/04/14
 * 工具类：需要实现JDK#InvocationHandler接口
 */
public class PressProxyHandler implements InvocationHandler {
    private final Subject subject;

    public PressProxyHandler(Subject subject) {
        this.subject = subject;
    }

    /**
     * @param proxy   代理对象，一般我们这里不用。
     * @param method  目标对象业务方法的封装。 被代理对象的哪个方法被代理，这里就是对应的方法对象封装。
     * @param args    目标对象业务方法的方法参数。
     * @return        方法返回值
     * ps： 最好了解点反射的知识点。
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        discount();
        result = method.invoke(subject);//执行被代理的方法。这里需要个被代理对象。
        give();
        return result;
    }

    private void discount() {
        System.out.println("今天的书八折");
    }

    private void give() {
        System.out.println("买书送圆珠笔一支");
    }
}
