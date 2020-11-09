package com.yaliout.designpatterns.behavioralpatterns.command;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:31
 * @since
 */
public class BrownGirl implements GirlStore {
    @Override
    public void chooseGirl() {
        System.out.println("choose girl: brown ");
    }

    @Override
    public void fuckGirl() {
        System.out.println("fuck girl: brown ");
    }

    @Override
    public void payMoney() {
        System.out.println("pay money: brown ");
    }
}
