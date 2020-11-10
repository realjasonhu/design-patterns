package com.yaliout.designpatterns.behavioralpatterns.iterator;

/**
 * @author Hu JunJie
 * @date 2020/11/10 10:51
 * @since
 */
public interface ChannelCollection {

    Channel addChannel(Channel channel);

    Channel removeChannel(Channel channel);

    ChannelIterator iterator(ChannelTypeEnum typeEnum);
}
