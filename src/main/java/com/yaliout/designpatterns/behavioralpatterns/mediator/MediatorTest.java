package com.yaliout.designpatterns.behavioralpatterns.mediator;

/**
 * 中介者模式：
 * 用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码更易于维护。
 * <p>
 * 优点：降低了类的复杂度，将一对多转化成一对一；各个类之间解耦；符合迪米特原则。
 * 缺点：中介者会庞大，变得复杂难以维护。
 *
 * @author Hu JunJie
 * @date 2020/11/9 15:37
 * @since
 */
public class MediatorTest {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoomImpl();
        User sara = new UserImpl(room, "Sara Jay");
        room.addUser(sara);
        User lisa = new UserImpl(room, "Lisa Ann");
        room.addUser(lisa);
        User diamond = new UserImpl(room, "Diamond Jackson");
        room.addUser(diamond);

        sara.send("hi baby.");
    }
}
