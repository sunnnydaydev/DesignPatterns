package pattern_factory.more_factory;

import pattern_factory.base.MailSender;
import pattern_factory.base.Sender;
import pattern_factory.base.SmsSender;

/**
 * Create by SunnyDay on 2019/03/16
 * 多个工厂：提供不同的方法创建不同的对象
 * 优点：对普通工厂的改进。
 */
public class MoreSendFactory {
    /**
     * 创建 MailSender 对象
     */
    public Sender produceMail() {
        return new MailSender();
    }

    /**
     * 创建SmsSender 对象
     */
    public Sender produceSms() {
        return new SmsSender();
    }
}
