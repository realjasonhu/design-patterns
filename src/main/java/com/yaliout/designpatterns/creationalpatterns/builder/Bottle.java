package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 装瓶
 *
 * @author Hu JunJie
 * @date 2020/10/27 13:55
 * @since
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
