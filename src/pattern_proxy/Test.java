package pattern_proxy;

import pattern_proxy.auto_proxy.PressProxyHandler;
import pattern_proxy.cglib.NovelPress;
import pattern_proxy.cglib.ProxyHelper;
import pattern_proxy.static_proxy.Press;
import pattern_proxy.static_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * Create by SunnyDay on 2019/04/14
 */
public class Test {

    /**
     PressProxyHandler#getPressProxy方法

     public Subject getPressProxy(){
        return (Subject) Proxy.newProxyInstance(
                Press.class.getClassLoader(),
                Press.class.getInterfaces(),
                this);
    }
     */

    public static void main(String[] args) {
        PressProxyHandler handler = new PressProxyHandler();
        Subject press = handler.getPressProxy();
        press.sailBook();

        //test cglib
        NovelPress novelPressProxyObject = new ProxyHelper().getNovelProxyObject();
        novelPressProxyObject.sailBook();
    }
}


/**
 *  public static Object newProxyInstance(ClassLoader loader,
 *                                        Class<?>[] interfaces,
 *                                        InvocationHandler h)throws IllegalArgumentException
 * ClassLoader            loader： 类加载器，用于加载生成的代理类。 这里类加载器可通过被代理类来获取。（需要了解一些类加载的知识）
 * Class<?>[]         interfaces： 代理类实现的接口字节码对象。由于目标类与代理类都实现了同接口（可能多个相同的），因此也可通过目标类来获取。
 * InvocationHandler           h： 代理对象的调用处理程序。内部核心有个回调方法，代理类调用代理方法时，这个回调方法就会被执行。
 * */
