package com.yaliout.designpatterns.behavioralpatterns.state;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:54
 * @since
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        this.state.doAction(this);
    }
}
