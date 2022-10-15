package pattern_factory.abstract_factory;

import pattern_factory.base.Bread;
import pattern_factory.base.DarkRyeBread;
import pattern_factory.base.Sender;

/**
 * Create by SunnyDay 2022/10/15 12:58:23
 **/
public class DarkRyeBreadFactory implements Provider{
    // 不是本产品的功能，直接不进行功能处理。
    @Override
    public Sender produceMessage() {
        return null;
    }

    @Override
    public Bread produceBread() {
        return new DarkRyeBread();
    }
}
