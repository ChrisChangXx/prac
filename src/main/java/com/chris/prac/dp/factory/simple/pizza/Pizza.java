package com.chris.prac.dp.factory.simple.pizza;

/**
 * 披萨
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/6
 * @描述
 * @date 2021/06/06
 */
public interface Pizza {
    /**
     * 准备
     */
    void prepare();

    /**
     * 烤
     */
    void bake();

    /**
     * 切
     */
    void cut();

    /**
     * 装盒
     */
    void box();
}
