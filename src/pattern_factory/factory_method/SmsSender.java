package pattern_factory.factory_method;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
