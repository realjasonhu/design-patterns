package com.yaliout.designpatterns.behavioralpatterns.strategy;

/**
 * 策略模式：
 * 一个类的行为或其算法可以在运行时更改。
 * <p>
 * 优点：算法可以自由切换；避免使用多重条件判断；扩展性良好。
 * 缺点：策略类会增多；所有策略类都需要对外暴露。
 * <p>
 * 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
 *
 * @author Hu JunJie
 * @date 2020/11/9 18:59
 * @since
 */
public class StrategyTest {

    public static void main(String[] args) {
        StarContext context = new StarContext(new OperationAss());
        context.makeAllNight(2, 1);

        context = new StarContext(new OperationTits());
        context.makeAllNight(3, 1);

        context = new StarContext(new OperationMouth());
        context.makeAllNight(3, 1);
    }
}
