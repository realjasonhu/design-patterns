package com.yaliout.designpatterns.behavioralpatterns.interpreter;

/**
 * @author Hu JunJie
 * @date 2020/11/10 10:05
 * @since
 */
public class ChooseWhiteGirlExpression implements Expression {

    private Girl girl;

    public ChooseWhiteGirlExpression(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getGirlName(Girl girl) {
        if ("white".equals(girl.getGirlSkinColor()))
            return "mimi";
        else
            return "";
    }
}
