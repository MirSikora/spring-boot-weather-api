package cz.vsb.project.service;

import cz.vsb.project.City;
import cz.vsb.project.connector.WeatherApiConnector;
import cz.vsb.project.dto.WeatherApiDto;
import cz.vsb.project.dto.WeatherDto;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.text.ParseException;

@Service
public class WeatherService {

    public WeatherDto getWeatherForCity(City cityEnum) throws URISyntaxException, ParseException {
        WeatherApiConnector connector = new WeatherApiConnector();
        WeatherApiDto connectorWeatherApiDto = connector.getWeatherForCity(cityEnum);
        return transformDto(connectorWeatherApiDto);
    }

    private WeatherDto transformDto(WeatherApiDto weatherApiDto) throws ParseException {
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setLocation(weatherApiDto.getLocation().getName());
        weatherDto.setTimestamp(weatherApiDto.getLocation().getLocaltime());
        weatherDto.setWeather_description(weatherApiDto.getCurrent().getCondition().getText());
        weatherDto.setTemp_celsius(weatherApiDto.getCurrent().getTemp_c());
        weatherDto.setRel_humadity(weatherApiDto.getCurrent().getHumidity());
        weatherDto.setWind_direction(weatherApiDto.getCurrent().getWind_dir());
        weatherDto.setWindSpeed_mps(weatherApiDto.getCurrent().getWind_kph());
        return weatherDto;
    }
}
