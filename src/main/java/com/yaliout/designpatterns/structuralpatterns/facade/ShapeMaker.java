package com.yaliout.designpatterns.structuralpatterns.facade;

/**
 * @author Hu JunJie
 * @date 2020/11/9 11:22
 * @since
 */
public class ShapeMaker {

    private Shape circle;

    private Shape square;

    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
