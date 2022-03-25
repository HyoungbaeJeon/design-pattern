package pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        // 구독을 하자
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        // notifyObservers 에서 호출 되는 method
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: "+temperature
                + "F degrees and"+humidity + "%humidity");
    }
}

