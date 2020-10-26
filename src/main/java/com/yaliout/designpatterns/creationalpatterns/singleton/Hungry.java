package com.yaliout.designpatterns.creationalpatterns.singleton;

/**
 * @author Hu JunJie
 * @date 2020/10/26 16:35
 * @since
 */
public class Hungry {
    private static Hungry instance = new Hungry();

    private Hungry() {

    }

    public static Hungry getInstance() {
        return instance;
    }
}
