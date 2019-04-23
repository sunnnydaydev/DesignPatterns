package pattern_adapter;

/**
 * Create by SunnyDay on 2019/04/23
 *
 * 适配器：以手机充电器为例子
 */
public class PhoneAdapter extends AlternatingCurrent implements Target {

    public void use5V(){
        this.use22V();
        System.out.println("转换为5V，使用5V的交流电");
    }
}
