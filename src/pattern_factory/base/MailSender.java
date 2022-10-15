package pattern_factory.base;

/**
 * Create by SunnyDay on 2019/03/16
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
