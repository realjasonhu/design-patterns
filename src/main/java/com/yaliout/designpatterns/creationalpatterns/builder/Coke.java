package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 可口可乐
 *
 * @author Hu JunJie
 * @date 2020/10/27 14:02
 * @since
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 0.1F;
    }
}
