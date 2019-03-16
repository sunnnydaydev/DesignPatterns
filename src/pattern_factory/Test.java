package pattern_factory;

import pattern_factory.abstract_factory.MailSendFactory;
import pattern_factory.abstract_factory.Provider;
import pattern_factory.abstract_factory.SmsSendFactory;
import pattern_factory.factory_method.MoreSendFactory;
import pattern_factory.factory_method.Sender;
import pattern_factory.factory_method.SimpleSendFactory;
import pattern_factory.factory_method.StaticSendFactory;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("工厂方法模式三种类型:");
        System.out.println("1、普通工厂模式:");
        SimpleSendFactory simpleSendFactory = new SimpleSendFactory();
        simpleSendFactory.produce("mail").send();
        simpleSendFactory.produce("sms").send();
        // simpleSendFactory.produce("haha").send();  异常类型演示
        System.out.println("2、多个工厂模式:");
        MoreSendFactory moreSendFactory = new MoreSendFactory();
        moreSendFactory.produceMail().send();
        moreSendFactory.produceSms().send();
        System.out.println("3、静态工厂模式:");
        StaticSendFactory.produceMail().send();
        StaticSendFactory.produceSms().send();

        System.out.println("抽象工厂：");
        // 完整写法
        Provider provider = new MailSendFactory();
        Sender sender = provider.produce();
        sender.send();
         //简写
        new SmsSendFactory().produce().send();

        // 抽象工厂进行了两次多态的调用

    }
}
