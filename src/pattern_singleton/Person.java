package pattern_singleton;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class Person {
    // 提供私有静态对象
    private static Person person = new Person();
    // 私有构造函数
    private Person() {}
    // 暴露方法 提供对象
    public static Person getInstance() {
        return person;
    }
}
