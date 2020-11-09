package com.yaliout.designpatterns.structuralpatterns.proxy;

/**
 * 代理模式：
 * 使用场景：想要对一个类的访问做控制。
 * <p>
 * 代理模式与工厂模式：
 * 工厂模式是创建型模式，侧重的是对象创建，代理模式侧重的是对类访问的控制。
 *
 * @author Hu JunJie
 * @date 2020/11/9 10:01
 * @since
 */
public class ProxyTest {

    public static void main(String[] args) {
        Image image = new ProxyImage("test01");
        image.display();
        System.out.println("\n");
        image.display();
    }
}
