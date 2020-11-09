package com.yaliout.designpatterns.structuralpatterns.decorator;

/**
 * 装饰类
 *
 * @author Hu JunJie
 * @date 2020/11/9 14:34
 * @since
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
