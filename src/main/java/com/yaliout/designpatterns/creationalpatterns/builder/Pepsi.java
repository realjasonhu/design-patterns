package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * @author Hu JunJie
 * @date 2020/10/27 14:02
 * @since
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 0.1F;
    }
}
