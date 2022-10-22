package pattern_factory.more_factory;

import pattern_factory.base.Bread;
import pattern_factory.base.DarkRyeBread;
import pattern_factory.base.LightRyeBread;

/**
 * Create by SunnyDay 2022/10/16 13:34:11
 **/
public class MoreBreadFactory {
    public Bread createDarkRyeBread(){
        return new DarkRyeBread();
    }

    public Bread createLightRyeBread(){
        return new LightRyeBread();
    }
}
