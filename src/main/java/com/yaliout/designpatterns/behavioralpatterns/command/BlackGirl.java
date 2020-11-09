package com.yaliout.designpatterns.behavioralpatterns.command;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:31
 * @since
 */
public class BlackGirl implements GirlStore {
    @Override
    public void chooseGirl() {
        System.out.println("choose girl: black ");
    }

    @Override
    public void fuckGirl() {
        System.out.println("fuck girl: black ");
    }

    @Override
    public void payMoney() {
        System.out.println("pay money: black ");
    }
}
