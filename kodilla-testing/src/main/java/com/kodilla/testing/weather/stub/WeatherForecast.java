package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public Double calculateMedianTemperature() {
        List<Double> values = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(values);
        double median;
        if (temperatures.getTemperatures().size() % 2 == 0) {
            return median = (values.get(values.size() / 2) + values.get((values.size()/ 2) - 1))/2;
        }
        else {
            return median = values.get(values.size()/2);
        }
    }
}