package com.yaliout.designpatterns.structuralpatterns.facade;

/**
 * 圆形
 *
 * @author Hu JunJie
 * @date 2020/11/9 11:20
 * @since
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle: draw()");
    }
}
