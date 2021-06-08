package com.chris.prac.dp.factory.method;

import com.chris.prac.dp.factory.method.pizza.NyStyleCheesePizza;
import com.chris.prac.dp.factory.method.pizza.Pizza;
import com.chris.prac.dp.factory.method.store.NyStylePizzaStore;
import com.chris.prac.dp.factory.method.store.PizzaStore;

/**
 * 工厂方法测试
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza instanceof NyStyleCheesePizza);
    }
}
