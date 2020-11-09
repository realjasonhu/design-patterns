package com.yaliout.designpatterns.structuralpatterns.decorator;

/**
 * 装饰器模式：
 * 允许向一个现有的对象添加新的功能，同时不改变其结构。它是作为现有类的一个包装类。
 * <p>
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 缺点：多层装饰比较复杂。
 * <p>
 * 使用场景：扩展一个类的功能；动态增加功能，动态撤销。
 *
 * @author Hu JunJie
 * @date 2020/11/9 14:39
 * @since
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("circle with normal border");
        circle.draw();
        System.out.println();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        System.out.println("circle with red border ");
        redCircle.draw();
        System.out.println();
        ShapeDecorator greenCircle = new GreenShapeDecorator(new Circle());
        System.out.println("circle with green border ");
        greenCircle.draw();
    }

}
