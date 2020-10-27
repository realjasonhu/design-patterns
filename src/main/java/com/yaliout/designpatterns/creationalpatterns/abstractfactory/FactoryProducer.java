package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * @author Hu JunJie
 * @date 2020/10/27 11:14
 * @since
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
