package com.yaliout.designpatterns.behavioralpatterns.visitor;

/**
 * 百年老店
 *
 * @author Hu JunJie
 * @date 2020/11/10 8:55
 * @since
 */
public interface Brothel {

    int accept(BrothelVisitor visitor);

}
