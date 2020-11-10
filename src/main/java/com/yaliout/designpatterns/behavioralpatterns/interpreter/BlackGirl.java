package com.yaliout.designpatterns.behavioralpatterns.interpreter;

/**
 * @author Hu JunJie
 * @date 2020/11/10 9:06
 * @since
 */
public class BlackGirl extends Girl {

    public BlackGirl(int price, String name, boolean bush, String hairColor, String hairStyle) {
        this.price = price;
        this.name = name;
        this.bush = bush;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    @Override
    public String getGirlSkinColor() {
        return "black";
    }
}
