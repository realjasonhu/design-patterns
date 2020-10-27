package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 长方形
 *
 * @author Hu JunJie
 * @date 2020/10/27 11:03
 * @since
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle: method draw()");
    }
}
