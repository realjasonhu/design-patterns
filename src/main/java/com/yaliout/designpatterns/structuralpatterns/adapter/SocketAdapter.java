package com.yaliout.designpatterns.structuralpatterns.adapter;

/**
 * @author Hu JunJie
 * @date 2020/10/29 10:55
 * @since
 */
public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
