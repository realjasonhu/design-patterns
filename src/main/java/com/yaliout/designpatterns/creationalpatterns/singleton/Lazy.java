package com.yaliout.designpatterns.creationalpatterns.singleton;

/**
 * @author Hu JunJie
 * @date 2020/10/26 16:42
 * @since
 */
public class Lazy {

    private static Lazy instance = null;

    private Lazy() {

    }

    public static Lazy getInstance() {
        return new Lazy();
    }

    /**
     * {@link #getInstance()}方法在多线程的情况下是线程不安全的，
     * 所以可以使用<b>双重校验锁机制</b>来保证线程安全。
     *
     * @return
     */
    public static Lazy getNewInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                // 可能会存在两个getNewInstance同时加锁的情况，所以加锁成功后需要再判断一次
                if (instance == null) {
                    return new Lazy();
                }
            }
        }
        return instance;
    }
}
