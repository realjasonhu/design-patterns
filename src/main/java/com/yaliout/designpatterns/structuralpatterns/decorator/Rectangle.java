package com.yaliout.designpatterns.structuralpatterns.decorator;

/**
 * 长方形
 *
 * @author Hu JunJie
 * @date 2020/11/9 14:33
 * @since
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: rectangle ");
    }
}
