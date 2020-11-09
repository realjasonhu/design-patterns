package com.yaliout.designpatterns.behavioralpatterns.observer;

/**
 * @author Hu JunJie
 * @date 2020/11/9 17:13
 * @since
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
