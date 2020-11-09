package com.yaliout.designpatterns.structuralpatterns.facade;

/**
 * 正方形
 *
 * @author Hu JunJie
 * @date 2020/11/9 11:20
 * @since
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square: draw()");
    }
}
