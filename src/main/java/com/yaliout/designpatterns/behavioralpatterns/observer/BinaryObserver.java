package com.yaliout.designpatterns.behavioralpatterns.observer;

/**
 * @author Hu JunJie
 * @date 2020/11/9 17:17
 * @since
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binary string: " + Integer.toBinaryString(subject.getState()));
    }
}
