package com.chris.prac.dp.singleton.eagerly;

/**
 * 单例（饿汉式）
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/8
 * @描述
 * @date 2021/06/08
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
