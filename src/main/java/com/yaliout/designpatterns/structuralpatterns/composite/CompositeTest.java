package com.yaliout.designpatterns.structuralpatterns.composite;

/**
 * 组合模式：
 * 又叫部分整体模式，用于把一组相似的对象当作一个单一的对象。
 * 优点：1. 高层模块调用简单；2. 节点自由增加。
 * 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类而不是接口，违反了依赖倒置原则。
 * 使用场景：部分、整体场景，例如树形菜单，文件、文件夹的管理。
 *
 * 依赖倒置原则：
 *
 *
 * @author Hu JunJie
 * @date 2020/11/9 9:15
 * @since
 */
public class CompositeTest {

    public static void main(String[] args) {
        CompositeUser ceo = new CompositeUser(1001L, "EMP001", "Jason");
        ceo.add(new CompositeUser(1002L, "EMP002", "emp002"));
        ceo.add(new CompositeUser(1003L, "EMP003", "emp003"));

        System.out.println(ceo.toString());
    }
}
