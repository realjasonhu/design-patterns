package com.yaliout.designpatterns.behavioralpatterns.mediator;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:01
 * @since
 */
public abstract class User {

    protected ChatRoom chatRoom;

    protected String name;

    public User(ChatRoom room,String name) {
        this.chatRoom = room;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
