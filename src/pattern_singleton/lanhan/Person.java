package pattern_singleton.lanhan;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class Person {
    private static Person person;

    private Person() {
    }

    public static synchronized Person getInstance() {
        if (person == null) {

            synchronized ("锁") {
                if (person == null) {
                    person = new Person();
                }
            }

        }
        return person;
    }
}
