package com.yaliout.designpatterns.structuralpatterns.bridge;

/**
 * 五角形
 *
 * @author Hu JunJie
 * @date 2020/11/9 13:54
 * @since
 */
public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("pentagon fill with color ");
        color.applyColor();
    }
}
