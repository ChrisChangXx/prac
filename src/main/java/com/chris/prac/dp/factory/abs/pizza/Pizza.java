package com.chris.prac.dp.factory.abs.pizza;

import com.chris.prac.dp.factory.abs.ingredient.Cheese;
import com.chris.prac.dp.factory.abs.ingredient.Dough;
import com.chris.prac.dp.factory.abs.ingredient.Sauce;

/**
 * 披萨
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/7
 * @描述
 * @date 2021/06/07
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    /**
     * 准备
     */
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void box() {
        System.out.println("Box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                '}';
    }
}
