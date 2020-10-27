package com.yaliout.designpatterns.creationalpatterns.builder;

/**
 * 模拟点套餐
 *
 * @author Hu JunJie
 * @date 2020/10/27 14:07
 * @since
 */
public class MealTest {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal combo1 = mealBuilder.prepareCombo1();
        System.out.println("combo1");
        combo1.showItems();
        System.out.println("Total Cost: " + combo1.getCost());

        Meal combo2 = mealBuilder.prepareCombo2();
        System.out.println("\n\ncombo2");
        combo2.showItems();
        System.out.println("Total Cost: " + combo2.getCost());
    }
}
