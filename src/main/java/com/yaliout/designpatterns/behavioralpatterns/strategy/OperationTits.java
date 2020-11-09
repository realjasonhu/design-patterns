package com.yaliout.designpatterns.behavioralpatterns.strategy;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:06
 * @since
 */
public class OperationTits implements AVStarStrategy {
    @Override
    public int makeLove(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("play tits: " + result);
        return result;
    }
}
