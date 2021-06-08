package com.chris.prac.dp.factory.simple;

import com.chris.prac.dp.factory.simple.pizza.CheesePizza;
import com.chris.prac.dp.factory.simple.pizza.GreekPizza;
import com.chris.prac.dp.factory.simple.pizza.PepperoniPizza;
import com.chris.prac.dp.factory.simple.pizza.Pizza;

/**
 * 简单的披萨工厂
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
