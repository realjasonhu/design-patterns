package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 蓝色
 *
 * @author Hu JunJie
 * @date 2020/10/27 11:10
 * @since
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue: method fill()");
    }
}
