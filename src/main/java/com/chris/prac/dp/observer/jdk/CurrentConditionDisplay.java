package com.chris.prac.dp.observer.jdk;

import com.chris.prac.dp.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @创建人 zhanghui
 * @创建时间 2021/5/19
 * @描述
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }
}
