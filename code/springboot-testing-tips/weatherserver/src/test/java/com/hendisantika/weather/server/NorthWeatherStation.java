package com.hendisantika.weather.server;

import com.hendisantika.weather.api.TemperatureUnit;
import com.hendisantika.weather.api.WeatherReportDTO;
import com.hendisantika.weather.api.WeatherStation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("north/weather")
public class NorthWeatherStation implements WeatherStation {

    @RequestMapping(method = RequestMethod.GET)
    public WeatherReportDTO getWeatherReport() {
        return new WeatherReportDTO(-3.2, TemperatureUnit.C, 30);
    }
}
