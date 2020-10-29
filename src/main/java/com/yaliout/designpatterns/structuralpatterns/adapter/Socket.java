package com.yaliout.designpatterns.structuralpatterns.adapter;

/**
 * @author Hu JunJie
 * @date 2020/10/29 10:54
 * @since
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
