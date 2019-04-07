package pattern_factory.abstract_factory;

        import pattern_factory.factory_method.Sender;

/**
 * Create by SunnyDay on 2019/03/16
 *
 *
 */
public interface Provider {
    Sender produce();
}
