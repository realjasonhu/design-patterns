package com.yaliout.designpatterns.behavioralpatterns.observer;

/**
 * @author Hu JunJie
 * @date 2020/11/9 17:17
 * @since
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("hex string: " + Integer.toHexString(subject.getState()));
    }
}
