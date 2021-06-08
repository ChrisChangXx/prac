package com.chris.prac.dp.singleton.doublecheck;

/**
 * 单例（双重检查加锁）
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/8
 * @描述
 * @date 2021/06/08
 */
public class Singleton {
    private static volatile Singleton singleton = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
