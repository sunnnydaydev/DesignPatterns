package pattern_singleton;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class SingletonDemo3 {
    // 单利设计模式  静态内部类单利 （推荐使用）
    private SingletonDemo3(){}
    public static class InnerClass{
        private static SingletonDemo3 singletonDemo3 = new SingletonDemo3();
        public static SingletonDemo3 getInstance(){
            return  singletonDemo3;
        }
    }
}
