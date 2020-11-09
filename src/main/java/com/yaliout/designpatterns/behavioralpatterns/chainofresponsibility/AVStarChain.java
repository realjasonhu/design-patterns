package com.yaliout.designpatterns.behavioralpatterns.chainofresponsibility;

/**
 * @author Hu JunJie
 * @date 2020/11/9 16:39
 * @since
 */
public interface AVStarChain {

    void setNextChain(AVStarChain nextChain);

    void fuckBaby(AVStar avStar);
}
