package pattern_factory.factory_method;

/**
 * Create by SunnyDay on 2019/03/16
 * 静态工厂：吧多个工厂的方法加上static 关键字 使他们都边城静态方法
 *
 * 优点： 方便调用，不需要创建工厂对象
 *
 */
public class StaticSendFactory {
    /**
     * 创建 MailSender 对象
     */
    public static Sender produceMail() {
        return new MailSender();
    }

    /**
     * 创建SmsSender 对象
     */
    public static Sender produceSms() {
        return new SmsSender();
    }
}
