package com.yaliout.designpatterns.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Hu JunJie
 * @date 2020/11/9 10:45
 * @since
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (Objects.isNull(circle)) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("creating circle of color: " + color);
        }
        return circle;
    }
}
