package com.chris.prac.dp.decorator;

/**
 * 浓缩咖啡
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/23
 * @描述
 * @date 2021/05/23
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
