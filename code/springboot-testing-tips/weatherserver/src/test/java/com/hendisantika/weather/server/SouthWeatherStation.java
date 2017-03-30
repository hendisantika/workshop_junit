package com.hendisantika.weather.server;

import com.hendisantika.weather.api.TemperatureUnit;
import com.hendisantika.weather.api.WeatherReportDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("south/weather")
public class SouthWeatherStation {
    @RequestMapping(method = RequestMethod.GET)
    public WeatherReportDTO getWeatherReport() {
        return new WeatherReportDTO(18.5, TemperatureUnit.C, 70);
    }
}
