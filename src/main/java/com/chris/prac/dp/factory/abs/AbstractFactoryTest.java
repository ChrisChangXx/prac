package com.chris.prac.dp.factory.abs;

import com.chris.prac.dp.factory.abs.store.NyPizzaStore;
import com.chris.prac.dp.factory.abs.store.PizzaStore;

/**
 * 抽象工厂测试
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
