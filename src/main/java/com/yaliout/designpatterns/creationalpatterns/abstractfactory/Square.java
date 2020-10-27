package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 正方形
 *
 * @author Hu JunJie
 * @date 2020/10/27 11:04
 * @since
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square: method draw()");
    }
}
