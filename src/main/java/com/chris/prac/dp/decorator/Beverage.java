package com.chris.prac.dp.decorator;

/**
 * 饮料
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/23
 * @描述
 * @date 2021/05/23
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 成本
     *
     * @return double
     */
    public abstract double cost();
}
