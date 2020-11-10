package com.yaliout.designpatterns.behavioralpatterns.visitor;

/**
 * @author Hu JunJie
 * @date 2020/11/10 9:06
 * @since
 */
public class WhiteGirl extends Girl implements Brothel {

    public WhiteGirl(int price, String name, boolean bush, String hairColor, String hairStyle) {
        this.price = price;
        this.name = name;
        this.bush = bush;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    @Override
    public int accept(BrothelVisitor visitor) {
        return visitor.visit(this);
    }
}
