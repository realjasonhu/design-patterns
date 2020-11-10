package com.yaliout.designpatterns.behavioralpatterns.interpreter;

/**
 * @author Hu JunJie
 * @date 2020/11/10 9:07
 * @since
 */
public class Girl {

    protected int price;

    protected String name;

    protected boolean bush;

    protected String hairStyle;

    protected String hairColor;

    protected String skinColor;

    public String getGirlSkinColor() {
        throw new RuntimeException("no skin color");
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBush() {
        return bush;
    }

    public void setBush(boolean bush) {
        this.bush = bush;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
