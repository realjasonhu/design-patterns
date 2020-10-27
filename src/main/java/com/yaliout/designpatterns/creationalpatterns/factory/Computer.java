package com.yaliout.designpatterns.creationalpatterns.factory;

/**
 * @author Hu JunJie
 * @date 2020/10/27 9:35
 * @since
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM=" + this.getRAM() + ",HDD=" + this.getHDD() + ",CPU=" + this.getCPU();
    }
}
