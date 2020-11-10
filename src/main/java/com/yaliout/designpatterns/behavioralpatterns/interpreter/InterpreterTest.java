package com.yaliout.designpatterns.behavioralpatterns.interpreter;

/**
 * 解释器模式：
 * 解释器模式提供了评估语言的语法或者表达式的方式，这种模式实现了一个表达式接口，、
 * 该接口解释一个特定的上下文，这种模式被用在 SQL 解析、符号处理引擎等。
 * <p>
 * 优点：
 * 1. 可扩展性比较好，灵活。
 * 2. 增加了新的解释表达式的方式。
 * 3. 易于实现简单文法。
 * 缺点：
 * 1. 可利用场景比较少。
 * 2. 对于复杂的文法比较难维护。
 * 3. 解释器模式会引起类膨胀。
 * 4. 解释器模式采用递归调用方法。
 * <p>
 * Examples:
 * {@link java.util.regex.Pattern} and subclasses of {@link java.text.Format}
 * are some of the examples of interpreter pattern used in {@code JDK}.
 *
 * @author Hu JunJie
 * @date 2020/11/10 9:32
 * @since
 */
public class InterpreterTest {

    public static void main(String[] args) {

        Girl girl = new WhiteGirl(100,"Sara Jay",true,"golden","long");

        Expression expression = new ChooseBushGirlExpression(girl);
        System.out.println(expression.getGirlName(girl));

    }
}
