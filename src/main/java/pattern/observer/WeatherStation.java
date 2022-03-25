package pattern.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // subscriber 에게 publisher 를 넘겨 구독을 할 수 있게 하자.
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

//        StatisticsDisplay statisticsDisplay =
//                new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay =
//                new ForecastDisplay(weatherData);

        // 테스트를 쉽게 하기 위해 이벤트를 발생시켜 notifyObservers 가 호출되게 하자.
        weatherData.setMeasurements(80, 65, 30.4f);
        // 테스트를 쉽게 하기 위해 이벤트를 발생시켜 notifyObservers 가 호출되게 하자.
        weatherData.setMeasurements(82, 70, 29.2f);
        // 테스트를 쉽게 하기 위해 이벤트를 발생시켜 notifyObservers 가 호출되게 하자.
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
