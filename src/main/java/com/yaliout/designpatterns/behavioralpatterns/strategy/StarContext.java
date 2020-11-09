package com.yaliout.designpatterns.behavioralpatterns.strategy;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:08
 * @since
 */
public class StarContext {

    private AVStarStrategy avStarStrategy;

    public StarContext(AVStarStrategy strategy) {
        this.avStarStrategy = strategy;
    }

    public int makeAllNight(int num1, int num2) {
        return avStarStrategy.makeLove(num1, num2);
    }
}
