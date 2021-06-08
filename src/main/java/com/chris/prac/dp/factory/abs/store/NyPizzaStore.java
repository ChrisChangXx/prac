package com.chris.prac.dp.factory.abs.store;

import com.chris.prac.dp.factory.abs.factory.PizzaIngredientFactory;
import com.chris.prac.dp.factory.abs.factory.ny.NyPizzaIngredientFactory;
import com.chris.prac.dp.factory.abs.ingredient.ny.NyCheese;
import com.chris.prac.dp.factory.abs.pizza.CheesePizza;
import com.chris.prac.dp.factory.abs.pizza.Pizza;

/**
 * 纽约披萨店
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/7
 * @描述
 * @date 2021/06/07
 */
public class NyPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
