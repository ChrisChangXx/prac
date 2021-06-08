package com.chris.prac.dp.factory.abs.pizza;

import com.chris.prac.dp.factory.abs.factory.PizzaIngredientFactory;

/**
 * 芝士披萨
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/7
 * @描述
 * @date 2021/06/07
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
