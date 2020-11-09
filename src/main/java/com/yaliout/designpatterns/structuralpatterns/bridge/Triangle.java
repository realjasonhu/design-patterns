package com.yaliout.designpatterns.structuralpatterns.bridge;

/**
 * 三角形
 *
 * @author Hu JunJie
 * @date 2020/11/9 13:54
 * @since
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("triangle fill with color ");
        color.applyColor();
    }
}
