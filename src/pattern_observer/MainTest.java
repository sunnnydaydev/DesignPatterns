package pattern_observer;

/**
 * Create by SunnyDay on 2019/04/10
 */
public class MainTest {
    public static void main(String[] args){
        // 1、声明被观察者
       PersonObservable observable = new PersonObservable();
        // 2、注册观察者
        observable .addObserver(new PersonObsever());
        //3、被观察者 状态改变
        observable.setAge(18);//  代码执行时  观察者会收到消息
        observable.setName("kate");//  代码执行时  观察者会收到消息

    }
}
// log:
//            观察到了更新数据
//            观察到了更新数据