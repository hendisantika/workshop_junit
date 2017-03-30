package com.hendisantika.weather;

import com.hendisantika.weather.api.Thermometer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StubThermometer implements Thermometer {

    @Value("${temperature:42}")
    private double temperature;

    public double getTemperatureInCelsius() {
        return temperature;
    }
}
