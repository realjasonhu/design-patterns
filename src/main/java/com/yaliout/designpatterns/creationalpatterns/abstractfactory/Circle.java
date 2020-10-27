package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 圆形
 *
 * @author Hu JunJie
 * @date 2020/10/27 11:06
 * @since
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle: method draw()");
    }
}
