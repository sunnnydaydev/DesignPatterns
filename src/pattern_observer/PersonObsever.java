package pattern_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Create by SunnyDay on 2019/04/10
 */
public class PersonObsever implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察到了更新数据");
    }
}
