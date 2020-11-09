package com.yaliout.designpatterns.behavioralpatterns.command;

/**
 * 命令模式：
 * 命令模式是一种数据驱动的设计模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适对象，并把该命令传给相应的对象，该对象执行命令。
 * <p>
 * 优点：降低了系统耦合度；新的命令可以很容易添加到系统中。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 *
 * @author Hu JunJie
 * @date 2020/11/9 19:36
 * @since
 */
public class CommandTest {

    public static void main(String[] args) {
        GirlStore girl = new BlackGirl();
        Command choose = new ChooseCommand(girl);
        choose.execute();
        Command play = new FuckCommand(girl);
        play.execute();
        Command pay = new PayCommand(girl);
        pay.execute();
    }
}
