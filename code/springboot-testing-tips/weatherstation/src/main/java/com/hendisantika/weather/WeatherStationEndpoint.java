package com.hendisantika.weather;

import com.hendisantika.weather.api.Hygrometer;
import com.hendisantika.weather.api.TemperatureUnit;
import com.hendisantika.weather.api.Thermometer;
import com.hendisantika.weather.api.WeatherReportDTO;
import com.hendisantika.weather.api.WeatherStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherStationEndpoint implements WeatherStation {

    @Autowired
    Thermometer thermometer;

    @Autowired
    Hygrometer hygrometer;

    @RequestMapping(value = "weather", method = RequestMethod.GET)
    public WeatherReportDTO getWeatherReport() {
        return new WeatherReportDTO(thermometer.getTemperatureInCelsius(), TemperatureUnit.C, hygrometer.getHumidityPercentage());
    }
}
