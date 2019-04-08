package pattern_singleton;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("p的内存地址："+ Person.getInstance());
        System.out.println("p的内存地址："+Person.getInstance());
        System.out.println("p的内存地址："+Person.getInstance());
    }

}
