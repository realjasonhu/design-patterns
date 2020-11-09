package com.yaliout.designpatterns.behavioralpatterns.chainofresponsibility;

/**
 * 责任链模式：
 * 顾名思义，为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，
 * 那么它会把相同的请求传给下一个接收者，以此类推。
 * <p>
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，
 * 所以职责链将请求的发送者和请求的处理者解耦了。
 *
 * @author Hu JunJie
 * @date 2020/11/9 16:22
 * @since
 */
public class ChainOfResponsibilityTest {

    private static AVStarChain getChain() {
        SaraJay saraJay = new SaraJay();
        LisaAnn lisaAnn = new LisaAnn();
        JuliaAnn juliaAnn = new JuliaAnn();
        saraJay.setNextChain(lisaAnn);
        lisaAnn.setNextChain(juliaAnn);
        return saraJay;
    }

    public static void main(String[] args) {
        AVStarChain chain = getChain();
        chain.fuckBaby(new AVStar(35, false));
    }

}
