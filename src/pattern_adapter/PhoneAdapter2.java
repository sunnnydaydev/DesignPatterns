package pattern_adapter;

/**
 * Create by SunnyDay on 2019/04/23
 * 对象适配器
 */
public class PhoneAdapter2 implements Target {
    private AlternatingCurrent alternatingCurrent;// 持有引用（uml类图依赖关系）

    // 初始化AlternatingCurrent：  通过 getter setter也行，这里通过构造。
    public PhoneAdapter2(AlternatingCurrent alternatingCurrent) {
        this.alternatingCurrent = alternatingCurrent;
    }

    @Override
    public void use22V() {
        alternatingCurrent.use22V();
    }

    public void use5V() {
        alternatingCurrent.use22V();
        System.out.println("转换为5V，使用5V的交流电");
    }
}
