package com.yaliout.designpatterns.structuralpatterns.decorator;

/**
 * @author Hu JunJie
 * @date 2020/11/9 14:36
 * @since
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("border color: red ");
    }
}
