package com.chris.prac.dp.factory.abs.factory;

import com.chris.prac.dp.factory.abs.ingredient.Cheese;
import com.chris.prac.dp.factory.abs.ingredient.Dough;
import com.chris.prac.dp.factory.abs.ingredient.Sauce;

/**
 * 披萨原料工厂
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public interface PizzaIngredientFactory {
    /**
     * 创建面团
     *
     * @return {@link Dough}
     */
    Dough createDough();

    /**
     * 创建奶酪
     *
     * @return {@link Cheese}
     */
    Cheese createCheese();

    /**
     * 创建酱
     *
     * @return {@link Sauce}
     */
    Sauce createSauce();
}
