package pattern_proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create by SunnyDay 2022/10/24 22:04:50
 * 工具类
 **/
public class ProxyHelper {
    private NovelPress mNovelPress;

    public ProxyHelper() {}

    /**
     * 获取 NovelPress 类的代理类对象。
     * 为啥返回值是NovelPress类型？因为cglib中代理类是目标类的子类。（就是这样设计的，就如jdk的动态代理只能对接口实现类进行代理一样）
     */
    public NovelPress getNovelProxyObject() {
        mNovelPress = new NovelPress();
        Enhancer enhancer = new Enhancer(); // cglib 使用这个类
        enhancer.setSuperclass(NovelPress.class);
        enhancer.setCallback(new MethodInterceptor() {
            /**
             * 通过代理类调用代理方法时，这个函数就会被回调。
             * @param o 目标对象
             * @param method 目标方法对象
             * @param objects 目标方法参数
             * */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("今天小说8折");
                mNovelPress.sailBook();
                System.out.println("买小说送圆珠笔一只");
                return null;
            }
        });
        return (NovelPress) enhancer.create();
    }

}
