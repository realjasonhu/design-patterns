package com.yaliout.designpatterns.behavioralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hu JunJie
 * @date 2020/11/10 13:40
 * @since
 */
public class CareTaker {

    private List<Memento> mementos;

    public CareTaker() {
        mementos = new ArrayList<>();
    }

    public Memento add(Memento memento) {
        mementos.add(memento);
        return memento;
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
