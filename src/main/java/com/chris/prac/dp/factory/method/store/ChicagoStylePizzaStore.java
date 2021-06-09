package com.chris.prac.dp.factory.method.store;

import com.chris.prac.dp.factory.method.pizza.ChicagoStyleCheesePizza;
import com.chris.prac.dp.factory.method.pizza.Pizza;

/**
 * 芝加哥风格披萨店
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("greek".equals(type)) {
        } else if ("pepperoni".equals(type)) {
        }
        return pizza;
    }
}
