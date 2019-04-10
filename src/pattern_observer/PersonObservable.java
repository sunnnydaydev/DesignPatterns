package pattern_observer;

import java.util.Observable;

/**
 * Create by SunnyDay on 2019/04/10
 *
 * 被观察者（Observable/Subject）
 * 自定义被观察者类  继承Observable
 */
public class PersonObservable extends Observable {
    private int age;
    private String name;

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.setChanged();//让对象改变（这个必须设置：手动通知对象改变了）
        this.notifyObservers();// 通知观察者
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.setChanged();
        this.notifyObservers();
        this.name = name;
    }
}
