package com.yaliout.designpatterns.behavioralpatterns.iterator;

/**
 * @author Hu JunJie
 * @date 2020/11/10 10:49
 * @since
 */
public class Channel {

    private double frequency;

    private ChannelTypeEnum type;

    public Channel() {

    }

    public Channel(double frequency, ChannelTypeEnum type) {
        this.frequency = frequency;
        this.type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", type=" + type +
                '}';
    }
}
