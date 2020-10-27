package com.yaliout.designpatterns.creationalpatterns.abstractfactory;

/**
 * 绿色
 *
 * @author Hu JunJie
 * @date 2020/10/27 11:09
 * @since
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green: method fill()");
    }
}
