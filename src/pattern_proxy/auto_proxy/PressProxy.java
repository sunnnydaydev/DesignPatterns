package pattern_proxy.auto_proxy;

import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by SunnyDay on 2019/04/14
 * 动态代理类：需要实现JDK#InvocationHandler接口
 */
public class PressProxy implements InvocationHandler {
    private final Subject subject;

    public PressProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        discount();
        result = method.invoke(subject);
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
