package com.yaliout.designpatterns.behavioralpatterns.template;

/**
 * 模板模式：
 * 一个抽象类公开定义了执行它方法的方式（模板），它的子类可以按需要重写方法实现，
 * 但调用将以抽象类中定义的方式进行。
 * <p>
 * 优点：封装不变部分，扩展可变部分；提取公共代码，便于维护；行为由父类控制，子类实现。
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 *
 * @author Hu JunJie
 * @date 2020/11/9 15:31
 * @since
 */
public class TemplateTest {

    public static void main(String[] args) {
        AVStar sara = new SaraJay();
        sara.goPlay();
        AVStar lisa = new LisaAnn();
        lisa.goPlay();
    }

}
