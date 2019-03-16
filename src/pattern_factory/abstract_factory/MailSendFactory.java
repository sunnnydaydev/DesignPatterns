package pattern_factory.abstract_factory;

import pattern_factory.factory_method.Sender;
import pattern_factory.factory_method.SmsSender;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class MailSendFactory implements Provider {


    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
