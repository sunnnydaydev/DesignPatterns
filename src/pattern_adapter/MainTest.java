package pattern_adapter;

/**
 * Create by SunnyDay on 2019/04/23
 * 测试类：
 * 客户端调用
 */
public class MainTest {
    public static void main(String[] args){
        // 1、客户想要给手机充电 如下方式是不能直接使用的
      AlternatingCurrent alternatingCurrent = new AlternatingCurrent();
      alternatingCurrent.use22V();

      //2、开始使用适配器（对类适配器）
        PhoneAdapter phoneAdapter = new PhoneAdapter();
        phoneAdapter.use5V();

        // 对象适配器
        PhoneAdapter2 phoneAdapter2 = new PhoneAdapter2(alternatingCurrent);
        phoneAdapter2.use5V();
    }
}
