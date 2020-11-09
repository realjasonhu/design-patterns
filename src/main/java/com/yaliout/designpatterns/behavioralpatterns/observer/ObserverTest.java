package com.yaliout.designpatterns.behavioralpatterns.observer;

/**
 * 观察者模式：
 * 当对象间存在一对多关系时，则使用观察者模式。
 * 比如，当一个对象被修改时，则会自动通知依赖它的对象。
 * <p>
 * 优点：观察者和被观察者是抽象耦合的；建立一套触发机制。
 * 缺点：
 * 1. 如果一个观察者对象有很多的直接和间接观察者的话，将所有的观察者都通知到会花费很多的时间。
 * 2. 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间循环调用，可能导致系统崩溃。
 * 3. 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 *
 * @author Hu JunJie
 * @date 2020/11/9 17:02
 * @since
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);
        System.out.println("1st state: 15");
        subject.setState(15);
        System.out.println();
        System.out.println("2nd state: 16");
        subject.setState(16);
    }
}
