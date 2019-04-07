package pattern_decorator;

/**
 * Create by SunnyDay on 2019/04/07
 */
public class CarWrap implements Icar {
    private Icar icar;// 对象引用类型 采用面向父类编程思想（可以修饰任意车  通用）

    public CarWrap(Icar car) {
        this.icar = car;
    }

    /**
     *  /对需要增强的进行改造
     * */
    @Override
    public void run() {
        System.out.println("我的宝马 5 秒启动！！！ 6的飞起");
    }

    /**
     * 对不需要增强的方法调用原来的方法（）
     * */
    @Override
    public void stop() {
        icar.stop();
    }
}
