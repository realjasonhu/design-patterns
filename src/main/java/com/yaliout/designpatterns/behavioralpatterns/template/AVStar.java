package com.yaliout.designpatterns.behavioralpatterns.template;

/**
 * @author Hu JunJie
 * @date 2020/11/9 15:26
 * @since
 */
public abstract class AVStar {

    protected abstract void playTits();

    protected abstract void playVagin();

    protected abstract void playAss();

    public final void goPlay() {
        playTits();
        playVagin();
        playAss();
    }
}
