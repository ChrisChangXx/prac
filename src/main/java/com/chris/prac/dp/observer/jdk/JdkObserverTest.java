package com.chris.prac.dp.observer.jdk;

/**
 * @创建人 zhanghui
 * @创建时间 2021/5/19
 * @描述
 */
public class JdkObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1.0f, 2.0f, 3.0f);
    }
}
