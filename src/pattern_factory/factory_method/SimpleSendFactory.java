package pattern_factory.factory_method;

/**
 * Create by SunnyDay on 2019/03/16
 * 普通工厂： 建立一个工厂类队实现统一接口的类进行创建
 *
 *  缺点：传入字符串错误时，不能创建对象
 */
public class SimpleSendFactory {
    /**
     * @function 创建不同的对象 根据传来的字符串
     * @param type 要创建类型字符串
     *
     * */
    public  Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else{
            throw new IllegalArgumentException("your string type is not right");
        }

    }
}
