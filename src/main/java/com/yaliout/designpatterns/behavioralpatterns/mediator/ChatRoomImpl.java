package com.yaliout.designpatterns.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:03
 * @since
 */
public class ChatRoomImpl implements ChatRoom {

    private List<User> userList;

    public ChatRoomImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public String sendMessage(User user, String message) {

        userList.forEach(u -> {
            if (u != user)
                u.receive(message);
        });

        return message;
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
