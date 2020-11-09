package com.yaliout.designpatterns.behavioralpatterns.chainofresponsibility;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:40
 * @since
 */
public class SaraJay implements AVStarChain {

    private AVStarChain chain;


    @Override
    public void setNextChain(AVStarChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void fuckBaby(AVStar star) {
        if (star.getTitsSize() == 36 && star.isBush()) {
            System.out.println("good,fuck Sara Jay tonight. ");
        } else {
            this.chain.fuckBaby(star);
        }
    }
}
