package com.yaliout.designpatterns.behavioralpatterns.state;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:57
 * @since
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("fucker is in start state ");
        context.setState(this);
    }


}
