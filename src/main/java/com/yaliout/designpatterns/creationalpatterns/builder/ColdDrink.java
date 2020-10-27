package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 冷饮
 *
 * @author Hu JunJie
 * @date 2020/10/27 13:58
 * @since
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
