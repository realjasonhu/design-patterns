package com.yaliout.designpatterns.behavioralpatterns.interpreter;

/**
 * 亚洲妹妹
 *
 * @author Hu JunJie
 * @date 2020/11/10 9:06
 * @since
 */
public class AsianGirl extends Girl {

    public AsianGirl(int price, String name, boolean bush, String hairColor, String hairStyle) {
        this.price = price;
        this.name = name;
        this.bush = bush;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    @Override
    public String getGirlSkinColor() {
        return "yellow";
    }
}
