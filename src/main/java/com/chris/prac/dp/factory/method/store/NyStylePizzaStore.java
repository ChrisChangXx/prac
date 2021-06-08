package com.chris.prac.dp.factory.method.store;

import com.chris.prac.dp.factory.method.pizza.NyStyleCheesePizza;
import com.chris.prac.dp.factory.method.pizza.Pizza;

/**
 * 纽约风格的披萨店
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class NyStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NyStyleCheesePizza();
        } else if ("greek".equals(type)) {
        } else if ("pepperoni".equals(type)) {
        }
        return pizza;
    }
}
