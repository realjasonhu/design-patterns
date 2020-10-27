package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * @author Hu JunJie
 * @date 2020/10/27 14:04
 * @since
 */
public class MealBuilder {

    /**
     * 套餐1：beef burger + coke
     *
     * @return
     */
    public Meal prepareCombo1() {
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 套餐2：chicken burger + pepsi
     *
     * @return
     */
    public Meal prepareCombo2() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
