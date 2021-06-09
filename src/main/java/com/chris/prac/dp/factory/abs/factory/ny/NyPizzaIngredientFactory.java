package com.chris.prac.dp.factory.abs.factory.ny;

import com.chris.prac.dp.factory.abs.factory.PizzaIngredientFactory;
import com.chris.prac.dp.factory.abs.ingredient.Cheese;
import com.chris.prac.dp.factory.abs.ingredient.Dough;
import com.chris.prac.dp.factory.abs.ingredient.Sauce;
import com.chris.prac.dp.factory.abs.ingredient.ny.NyCheese;
import com.chris.prac.dp.factory.abs.ingredient.ny.NyDough;
import com.chris.prac.dp.factory.abs.ingredient.ny.NySauce;

/**
 * 纽约披萨原料工厂
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NyDough();
    }

    @Override
    public Cheese createCheese() {
        return new NyCheese();
    }

    @Override
    public Sauce createSauce() {
        return new NySauce();
    }
}
