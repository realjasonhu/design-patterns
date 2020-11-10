package com.yaliout.designpatterns.behavioralpatterns.iterator;

/**
 * 迭代器模式：
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 应用实例：
 * Java 中的 Iterator。
 * 优点：
 * 1. 支持以不同的方式遍历一个聚合对象。
 * 2. 迭代器简化了聚合类。
 * 3. 在同一个聚合上可以有多个遍历。
 * 4. 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无需修改原有代码。
 * 缺点：
 * 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应新的聚合器类，类的个数成对增加，
 * 这在一定程度上增加了系统的复杂性。
 *
 * @author Hu JunJie
 * @date 2020/11/10 10:34
 * @since
 */
public class IteratorTest {

    public static void main(String[] args) {
        ChannelCollection collection = makeChannelCollection();
        ChannelIterator iterator = collection.iterator(ChannelTypeEnum.ALL);
        while (iterator.hasNext()) {
            Channel channel = iterator.next();
            System.out.println(channel.toString());
        }
        System.out.println("==============");
        iterator = collection.iterator(ChannelTypeEnum.CHINESE);
        while (iterator.hasNext()) {
            Channel channel = iterator.next();
            System.out.println(channel.toString());
        }
    }

    private static ChannelCollection makeChannelCollection() {
        ChannelCollection collection = new ChannelCollectionImpl();
        collection.addChannel(new Channel(1.01D, ChannelTypeEnum.CHINESE));
        collection.addChannel(new Channel(1.02D, ChannelTypeEnum.ENGLISH));
        collection.addChannel(new Channel(1.03D, ChannelTypeEnum.JAPANESE));
        collection.addChannel(new Channel(1.04D, ChannelTypeEnum.ESPANISH));
        collection.addChannel(new Channel(1.05D, ChannelTypeEnum.JAPANESE));
        collection.addChannel(new Channel(1.06D, ChannelTypeEnum.CHINESE));
        collection.addChannel(new Channel(1.07D, ChannelTypeEnum.FRENCH));
        return collection;
    }
}
