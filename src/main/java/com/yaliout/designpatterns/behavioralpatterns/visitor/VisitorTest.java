package com.yaliout.designpatterns.behavioralpatterns.visitor;

/**
 * 访问者模式：
 * 在被访问的类里面加一个对外提供接待访问者的接口。
 * <p>
 * 优点：符合单一职责原则；优秀的扩展性；灵活性。
 * 缺点：
 * 1. 具体元素对访问者公布细节，违反了迪米特原则。
 * 2. 具体元素变更比较困难。
 * 3. 违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 *
 * @author Hu JunJie
 * @date 2020/11/9 20:23
 * @since
 */
public class VisitorTest {

    public static void main(String[] args) {
        Girl black = new BlackGirl(30, "nana", false, "no", "no");
        Girl white = new WhiteGirl(100, "sara", false, "golden", "good");
        Girl asian = new AsianGirl(50, "lili", true, "black", "stright");

        BrothelVisitor visitor = new RealVisitor();
        int price = visitor.visit(black);
        System.out.println("black nana price: " + price);
        price = visitor.visit(white);
        System.out.println("white sara price: " + price);
        price = visitor.visit(asian);
        System.out.println("asian lili price: " + price);
    }
}
