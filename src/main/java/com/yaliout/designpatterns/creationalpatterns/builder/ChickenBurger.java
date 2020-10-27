package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 鸡肉汉堡
 *
 * @author Hu JunJie
 * @date 2020/10/27 14:00
 * @since
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 0.40F;
    }
}
