package pattern_proxy.auto_proxy;

import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by SunnyDay on 2019/04/14
 * <p>
 * 动态代理类：创建类实现InvocationHandler接口
 */
public class MyHandler implements InvocationHandler {
    private Subject subject;

    public MyHandler(Subject subject) {
        this.subject = subject;
    }

    /**
     * @function 在代理实例上处理方法调用并返回结果。
     * 在与方法关联的代理实例上调用方法时，
     * 将在调用处理程序上调用此方法。（来自api文档解释）
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        dazhe();
        result = method.invoke(subject);
        give();
        return result;
    }


    //
    private void dazhe() {
        System.out.println("卖书吗？书打折");
    }

    //
    private void give() {
        System.out.println("给你代金券");
    }
}
