package pattern_6_design_principle.codes.barbaralisko;

/**
 * Create by SunnyDay 2022/06/07 21:03:01
 **/
public class B extends Base {

    private A mA;

    public B(A a) {
        mA = a;
    }

    /**
     * B类重写基类方法，然后使用组合替代继承。实现两数相减。
     */
    @Override
    public int func1(int a, int b) {
        return mA.func1(a, b);
    }
    // B类拓展新功能
    public int func2(int a, int b) {
        return a + b + 100;
    }
}
