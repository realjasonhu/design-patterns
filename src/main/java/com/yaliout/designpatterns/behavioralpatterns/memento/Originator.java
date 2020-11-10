package com.yaliout.designpatterns.behavioralpatterns.memento;

/**
 * @author Hu JunJie
 * @date 2020/11/10 13:40
 * @since
 */
public class Originator implements Cloneable {

    private String state;

    public Memento saveToMemento() {
        return new Memento((Originator) this.clone());
    }

    public void getFromMemento(Memento memento) {
        this.state = memento.getOriginator().getState();
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
