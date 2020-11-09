package com.yaliout.designpatterns.structuralpatterns.facade;

/**
 * 长方形
 *
 * @author Hu JunJie
 * @date 2020/11/9 11:20
 * @since
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle: draw()");
    }
}
