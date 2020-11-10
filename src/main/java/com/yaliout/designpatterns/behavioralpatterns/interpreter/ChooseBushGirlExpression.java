package com.yaliout.designpatterns.behavioralpatterns.interpreter;

/**
 * @author Hu JunJie
 * @date 2020/11/10 10:05
 * @since
 */
public class ChooseBushGirlExpression implements Expression {

    private Girl girl;

    public ChooseBushGirlExpression(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getGirlName(Girl girl) {
        if (girl.isBush())
            return girl.getName();
        else
            return "";
    }
}
