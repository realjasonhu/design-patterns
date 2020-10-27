package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 包装
 *
 * @author Hu JunJie
 * @date 2020/10/27 13:54
 * @since
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
