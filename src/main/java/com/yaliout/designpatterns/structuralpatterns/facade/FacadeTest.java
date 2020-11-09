package com.yaliout.designpatterns.structuralpatterns.facade;

/**
 * 外观模式：
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 主要是为了降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 * <p>
 * 优点：减少系统相互依赖；提高灵活性；提高了安全性。
 * 缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 *
 * @author Hu JunJie
 * @date 2020/11/9 11:25
 * @since
 */
public class FacadeTest {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawSquare();
        maker.drawRectangle();
    }
}
