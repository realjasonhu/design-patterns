package com.yaliout.designpatterns.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hu JunJie
 * @date 2020/11/9 17:13
 * @since
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        int oldState = this.state;
        this.state = state;
        if (oldState != state)
            notifyAllObservers();
    }
}
