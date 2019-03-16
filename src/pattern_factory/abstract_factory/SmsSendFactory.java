package pattern_factory.abstract_factory;

import pattern_factory.factory_method.MailSender;
import pattern_factory.factory_method.Sender;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class SmsSendFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
