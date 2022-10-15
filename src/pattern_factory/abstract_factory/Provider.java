package pattern_factory.abstract_factory;

import pattern_factory.base.Bread;
import pattern_factory.base.Sender;

/**
 * Create by SunnyDay on 2019/03/16
 */
public interface Provider {
    Sender produceMessage();

    Bread produceBread();
}
