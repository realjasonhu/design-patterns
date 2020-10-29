package com.yaliout.designpatterns.structuralpatterns.adapter;

/**
 * @author Hu JunJie
 * @date 2020/10/29 10:53
 * @since
 */
public class Volt {

    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
