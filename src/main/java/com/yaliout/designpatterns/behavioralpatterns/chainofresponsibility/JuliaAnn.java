package com.yaliout.designpatterns.behavioralpatterns.chainofresponsibility;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:40
 * @since
 */
public class JuliaAnn implements AVStarChain {

    private AVStarChain chain;


    @Override
    public void setNextChain(AVStarChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void fuckBaby(AVStar star) {
        if (star.getTitsSize() == 37 && !star.isBush()) {
            System.out.println("good,fuck Julia Ann tonight. ");
        } else {
            this.chain.fuckBaby(star);
        }
    }
}
