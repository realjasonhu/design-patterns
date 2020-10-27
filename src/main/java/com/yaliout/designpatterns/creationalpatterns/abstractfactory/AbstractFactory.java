package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 工厂类
 * @author Hu JunJie
 * @date 2020/10/27 11:10
 * @since
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);
}
