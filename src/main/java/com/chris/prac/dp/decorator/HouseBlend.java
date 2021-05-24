package com.chris.prac.dp.decorator;

/**
 * 房子混合
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/23
 * @描述
 * @date 2021/05/23
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
