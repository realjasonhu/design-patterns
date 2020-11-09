package com.yaliout.designpatterns.behavioralpatterns.mediator;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:06
 * @since
 */
public class UserImpl extends User {
    public UserImpl(ChatRoom room, String name) {
        super(room, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("[" + this.name + "] send: " + msg);
        chatRoom.sendMessage(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("[" + this.name + "] receive: " + msg);
    }
}
