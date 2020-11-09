package com.yaliout.designpatterns.behavioralpatterns.state;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:57
 * @since
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("fucker is in stop state ");
        context.setState(this);
    }

    
}
