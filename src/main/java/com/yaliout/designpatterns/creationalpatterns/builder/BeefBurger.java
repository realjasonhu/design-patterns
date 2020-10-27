package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 牛肉汉堡
 *
 * @author Hu JunJie
 * @date 2020/10/27 13:59
 * @since
 */
public class BeefBurger extends Burger {
    @Override
    public String name() {
        return "beef burger";
    }

    @Override
    public float price() {
        return 0.50F;
    }
}
