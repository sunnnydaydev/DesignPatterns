package pattern_adapter.clazz;

import pattern_adapter.source.HomePowerSocket;
import pattern_adapter.source.IConvert;

/**
 * Create by SunnyDay 2022/11/20 12:24:20
 * 适配器,以继承方式实现也称类适配器
 **/
public class PhoneAdapter extends HomePowerSocket implements IConvert {

    @Override
    public void use22V() {
        this.outPut();
    }

    /**
     * 客户端需要的兼容接口
     * */
    @Override
    public void convertTo5V() {
         this.use22V();
        System.out.println("手机充电器把22V电转化为5V输出");
    }
}
