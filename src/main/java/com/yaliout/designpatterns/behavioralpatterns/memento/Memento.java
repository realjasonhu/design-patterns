package com.yaliout.designpatterns.behavioralpatterns.memento;

/**
 * @author Hu JunJie
 * @date 2020/11/10 13:40
 * @since
 */
public class Memento {

    private Originator originator;

    public Memento(Originator originator) {
        this.originator = originator;
    }

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
