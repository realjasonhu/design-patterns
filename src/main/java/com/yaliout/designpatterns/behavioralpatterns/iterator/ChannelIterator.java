package com.yaliout.designpatterns.behavioralpatterns.iterator;

/**
 * @author Hu JunJie
 * @date 2020/11/10 10:50
 * @since
 */
public interface ChannelIterator {

    boolean hasNext();

    Channel next();
}
