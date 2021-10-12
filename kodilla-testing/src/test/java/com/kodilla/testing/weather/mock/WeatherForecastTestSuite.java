package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    private Map<String,Double> temperaturesMap;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
        public void init() {
            temperaturesMock = mock(Temperatures.class);
            temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
    }
    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        assertEquals(5, quantityOfSensors);
   }

   @Test
    void testCalculateAverageTemperature() {
       //Given
       when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
       WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
       //When
       double averageTemp =  weatherForecast.calculateAverageTemperature();
       //Then
        assertEquals(25.56,averageTemp);
   }

   @Test
    void testCalculateMedianTemperature() {
        //Given
       when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
       WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
       //When
       double medianTemp =  weatherForecast.calculateMedianTemperature();
       //Then
       assertEquals(25.5, medianTemp);
   }


    @Test
    void testCalculateMedianTemperatureWhenMapHasSizeIsEven() {
        //Given
        temperaturesMap.remove("Warszawa");
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double medianTemp =  weatherForecast.calculateMedianTemperature();
        //Then
        assertEquals(25.8, medianTemp);
    }
    }


