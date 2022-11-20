package pattern_adapter.obj;

import pattern_adapter.source.HomePowerSocket;
import pattern_adapter.source.IConvert;

/**
 * Create by SunnyDay 2022/11/20 12:50:25
 * 适配器：持有适配者的引用，因此叫做对象适配器。
 **/
public class PhoneAdapter implements IConvert {
    private final HomePowerSocket homePowerSocket;

    public PhoneAdapter(HomePowerSocket homePowerSocket) {
        this.homePowerSocket = homePowerSocket;
    }

    @Override
    public void use22V() {
        homePowerSocket.outPut();
    }

    @Override
    public void convertTo5V() {
        this.use22V();
        System.out.println("手机充电器把22V电转化为5V输出");
    }
}
