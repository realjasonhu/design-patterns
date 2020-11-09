package com.yaliout.designpatterns.behavioralpatterns.mediator;

/**
 * 聊天室
 *
 * @author Hu JunJie
 * @date 2020/11/9 16:00
 * @since
 */
public interface ChatRoom {

    String sendMessage(User user,String message);

    void addUser(User user);
}
