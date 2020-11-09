package com.yaliout.designpatterns.structuralpatterns.bridge;

/**
 * 绿色
 *
 * @author Hu JunJie
 * @date 2020/11/9 13:58
 * @since
 */
public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("green.");
    }
}
