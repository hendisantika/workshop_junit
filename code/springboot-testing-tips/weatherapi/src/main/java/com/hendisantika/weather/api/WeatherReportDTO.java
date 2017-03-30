package com.hendisantika.weather.api;

import lombok.Value;

@Value
public class WeatherReportDTO {
    private double temperature;
    private TemperatureUnit unit;
    private int humidity;
}
