package com.hendisantika.weather.server;

import com.hendisantika.weather.api.WeatherReportDTO;

public interface WeatherStationClient {
    WeatherReportDTO getTemperatureByPostalCode(int postCode, String unit);
}
