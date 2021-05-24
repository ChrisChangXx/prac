package com.chris.prac.dp.observer;

/**
 * 观察测试
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/17
 * @描述
 * @date 2021/05/17
 */
public class ObserverTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1.0f, 1.0f, 1.0f);
    }
}
