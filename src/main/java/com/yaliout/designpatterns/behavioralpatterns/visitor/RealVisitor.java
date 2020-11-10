package com.yaliout.designpatterns.behavioralpatterns.visitor;

/**
 * @author Hu JunJie
 * @date 2020/11/10 9:19
 * @since
 */
public class RealVisitor implements BrothelVisitor {

    @Override
    public int visit(Girl girl) {
        return girl.getPrice();
    }
}
