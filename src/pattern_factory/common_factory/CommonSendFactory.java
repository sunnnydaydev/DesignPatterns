package pattern_factory.common_factory;

import pattern_factory.base.MailSender;
import pattern_factory.base.Sender;
import pattern_factory.base.SmsSender;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class CommonSendFactory {
    public static final String MAIL_SENDER = "mail";
    public static final String SMS_SENDER = "sms";
    /**
     * @function 创建不同的对象 根据传来的字符串
     * @param type 要创建类型字符串
     *
     * */
    public Sender produce(String type){
        if (MAIL_SENDER.equals(type)){
            return new MailSender();
        }else if (SMS_SENDER.equals(type)){
            return new SmsSender();
        }else{
            throw new IllegalArgumentException("create object fail, there is no"+type+"object to create！");
        }

    }
}
