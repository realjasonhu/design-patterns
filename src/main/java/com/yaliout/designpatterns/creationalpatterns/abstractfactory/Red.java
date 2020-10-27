package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 红色
 *
 * @author Hu JunJie
 * @date 2020/10/27 11:08
 * @since
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red: method fill()");
    }
}
