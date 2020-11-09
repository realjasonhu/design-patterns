package com.yaliout.designpatterns.structuralpatterns.flyweight;

/**
 * 享元模式：
 * 主要用于减少创建对象的数量，以减少内存占用和提高性能。
 *
 * 应用实例：
 * 1. Java 中的 String ，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
 * 2. 数据库的连接池。
 *
 * 优点：大大减少了对象的创建，降低占用的系统内存，从而提高效率。
 * 缺点：提高了系统的复杂度，需要分离出内部状态和外部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
 *
 *
 *
 * @author Hu JunJie
 * @date 2020/11/9 10:50
 * @since
 */
public class FlyweightTest {

    private static final String[] colors = {"red", "green", "black", "blue", "white", "yellow"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
