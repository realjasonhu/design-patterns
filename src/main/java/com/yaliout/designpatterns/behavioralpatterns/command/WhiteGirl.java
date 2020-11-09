package com.yaliout.designpatterns.behavioralpatterns.command;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:31
 * @since
 */
public class WhiteGirl implements GirlStore {
    @Override
    public void chooseGirl() {
        System.out.println("choose girl: white ");
    }

    @Override
    public void fuckGirl() {
        System.out.println("fuck girl: white ");
    }

    @Override
    public void payMoney() {
        System.out.println("pay money: white ");
    }
}
