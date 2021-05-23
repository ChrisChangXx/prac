package com.chris.prac.dp.decorator;

/**
 * 装饰器测试
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/23
 * @描述
 * @date 2021/05/23
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + "$" + espresso.cost());
    }
}
