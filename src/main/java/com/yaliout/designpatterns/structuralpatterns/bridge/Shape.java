package com.yaliout.designpatterns.structuralpatterns.bridge;

/**
 * @author Hu JunJie
 * @date 2020/11/9 13:53
 * @since
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
