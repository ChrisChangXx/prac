package com.chris.prac.dp.factory.abs.store;

import com.chris.prac.dp.factory.abs.pizza.Pizza;

/**
 * 披萨店
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 创建披萨
     *
     * @param type 类型
     * @return {@link Pizza}
     */
    abstract Pizza createPizza(String type);
}
