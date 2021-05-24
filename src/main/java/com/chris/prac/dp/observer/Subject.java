package com.chris.prac.dp.observer;

/**
 * 主题接口
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/17
 * @描述
 * @date 2021/05/17
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
