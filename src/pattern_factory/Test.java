package pattern_factory;

import pattern_factory.abstract_factory.DarkRyeBreadFactory;
import pattern_factory.abstract_factory.MailSendFactory;
import pattern_factory.abstract_factory.Provider;
import pattern_factory.abstract_factory.SmsSendFactory;
import pattern_factory.base.Bread;
import pattern_factory.more_factory.MoreSendFactory;
import pattern_factory.base.Sender;
import pattern_factory.common_factory.CommonSendFactory;
import pattern_factory.factory_method.StaticSendFactory;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("工厂方法模式三种类型:");
        System.out.println("1、普通工厂模式:");
        CommonSendFactory simpleSendFactory = new CommonSendFactory();
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
        // 抽象工厂：以Mail为栗子。
        Provider mailProvider = new MailSendFactory();
        Sender sender = mailProvider.produceMessage();
        sender.send();
        //抽象工厂：以DarkRyeBread为栗子。
        Provider darkRyeProvider = new DarkRyeBreadFactory();
        Bread bread =darkRyeProvider.produceBread();
        bread.bread();
         //简写
//        new SmsSendFactory().produceMessage().send();
//        new DarkRyeBreadFactory().produceBread().bread();
    }
}
