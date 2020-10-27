package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * @author Hu JunJie
 * @date 2020/10/27 13:56
 * @since
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
