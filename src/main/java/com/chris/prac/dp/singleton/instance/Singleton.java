package com.chris.prac.dp.singleton.instance;

/**
 * 单例（懒汉式）
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/8
 * @描述
 * @date 2021/06/08
 */
public class Singleton {
    private static Singleton singleton = null;

    public Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
