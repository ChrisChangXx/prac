package com.chris.prac.dp.observer;

/**
 * 观察者接口
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/17
 * @描述
 * @date 2021/05/17
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
