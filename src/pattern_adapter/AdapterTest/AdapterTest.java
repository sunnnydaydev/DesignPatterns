package pattern_adapter.AdapterTest;

import pattern_adapter.clazz.PhoneAdapter;
import pattern_adapter.source.HomePowerSocket;

/**
 * Create by SunnyDay 2022/11/20 12:55:48
 **/
public class AdapterTest {
    public static void main(String[] args) {
        // 直接拿220的电，不能使用,不是客户所期望的。
        HomePowerSocket socket = new HomePowerSocket();
        socket.outPut();

        System.out.println("-------------------------");

        //直接使用适配器即可：类适配器方式
        PhoneAdapter adapter = new PhoneAdapter();
        adapter.convertTo5V();
        System.out.println("-------------------------");

        //直接使用适配器即可：对象适配器方式
        pattern_adapter.obj.PhoneAdapter phoneAdapter = new pattern_adapter.obj.PhoneAdapter(socket);
        phoneAdapter.convertTo5V();
    }
}
