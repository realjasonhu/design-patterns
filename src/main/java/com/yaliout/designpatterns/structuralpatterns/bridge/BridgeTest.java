package com.yaliout.designpatterns.structuralpatterns.bridge;

/**
 * 桥接模式：
 * 将抽象部分和实现部分分离，使它们都可以独立的变化。
 * （在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活）。
 * <p>
 * 优点：抽象和实现的分离；优秀的扩展能力；实现细节对客户透明。
 * 缺点：桥接模式的引入会增加系统的理解和设计难度，由于聚合关系建立在抽象层，要求开发者针对抽象进行设计和编程。
 *
 * @author Hu JunJie
 * @date 2020/11/9 13:57
 * @since
 */
public class BridgeTest {

    public static void main(String[] args1) {
        Shape triangle = new Triangle(new RedColor());
        Shape pentagon = new Pentagon(new GreenColor());
        Shape pentagon1 = new Pentagon(new RedColor());
        triangle.applyColor();
        pentagon.applyColor();
        pentagon1.applyColor();
    }
}
