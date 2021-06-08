package com.chris.prac.dp.factory.simple;

import com.chris.prac.dp.factory.simple.pizza.CheesePizza;
import com.chris.prac.dp.factory.simple.pizza.Pizza;

/**
 * 简单的工厂测试
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza instanceof CheesePizza);
    }
}
