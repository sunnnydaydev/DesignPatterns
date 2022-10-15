package pattern_factory.abstract_factory;

import pattern_factory.base.Bread;
import pattern_factory.base.MailSender;
import pattern_factory.base.Sender;
import pattern_factory.base.SmsSender;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class SmsSendFactory implements Provider {

    @Override
    public Sender produceMessage() {
        return new SmsSender();
    }

    @Override
    public Bread produceBread() {
        return null;
    }
}
