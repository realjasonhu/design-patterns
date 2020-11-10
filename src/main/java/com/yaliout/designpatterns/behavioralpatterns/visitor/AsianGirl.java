package com.yaliout.designpatterns.behavioralpatterns.visitor;

/**
 * 亚洲妹妹
 * @author Hu JunJie
 * @date 2020/11/10 9:06
 * @since
 */
public class AsianGirl extends Girl implements Brothel {

    public AsianGirl(int price, String name, boolean bush, String hairColor, String hairStyle) {
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
