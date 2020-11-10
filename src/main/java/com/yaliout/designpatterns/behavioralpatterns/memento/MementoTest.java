package com.yaliout.designpatterns.behavioralpatterns.memento;

/**
 * 备忘录模式：
 * 备忘录模式保存一个对象的某个状态，以便在适当的时候恢复对象。
 * <p>
 * 优点：
 * 1. 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便的回到某个历史状态。
 * 2. 实现了信息的封装，使得用户不需要关心状态的保存细节。
 * <p>
 * 缺点：
 * 消耗资源，如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 * <p>
 * 使用场景：
 * 1. 需要保存/恢复数据的相关状态场景。
 * 2. 提供一个可回滚的操作。
 * <p>
 * 注意事项：
 * 1. 为了符合迪米特原则，还需要增加一个管理备忘录的类。
 * 2. 为了节约内存，可使用原型模式 + 备忘录模式。<b>但是需要注意浅拷贝问题。</b>
 *
 * @author Hu JunJie
 * @date 2020/11/10 11:25
 * @since
 */
public class MementoTest {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state #1");
        careTaker.add(originator.saveToMemento());
        originator.setState("state #2");
        careTaker.add(originator.saveToMemento());

        System.out.println(careTaker.get(0).getOriginator().getState());
    }
}
