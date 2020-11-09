package com.yaliout.designpatterns.behavioralpatterns.chainofresponsibility;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:36
 * @since
 */
public class AVStar {

    private int titsSize;

    private boolean bush;

    public AVStar(int titsSize, boolean bush) {
        this.titsSize = titsSize;
        this.bush = bush;
    }

    public int getTitsSize() {
        return titsSize;
    }

    public void setTitsSize(int titsSize) {
        this.titsSize = titsSize;
    }

    public boolean isBush() {
        return bush;
    }

    public void setBush(boolean bush) {
        this.bush = bush;
    }
}
