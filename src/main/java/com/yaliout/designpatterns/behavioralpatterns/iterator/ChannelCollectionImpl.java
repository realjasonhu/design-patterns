package com.yaliout.designpatterns.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hu JunJie
 * @date 2020/11/10 10:53
 * @since
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channels;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public Channel addChannel(Channel channel) {

        this.channels.add(channel);
        return channel;
    }

    @Override
    public Channel removeChannel(Channel channel) {
        this.channels.remove(channel);
        return channel;
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channels);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelTypeEnum type;

        private List<Channel> channels;

        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel channel = channels.get(position);
                if (type.equals(channel.getType()) || ChannelTypeEnum.ALL.equals(type))
                    return true;
                else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = channels.get(position);
            position++;
            return channel;
        }
    }
}
