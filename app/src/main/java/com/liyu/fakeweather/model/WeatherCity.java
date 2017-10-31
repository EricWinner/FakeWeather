package com.liyu.fakeweather.model;

import org.litepal.crud.DataSupport;

/**
 * 本地城市天气集合，可排序
 * Created by liyu on 2017/10/25.
 */

public class WeatherCity extends DataSupport {

    private int cityIndex;
    private String cityName;
    private String weatherCode;
    private String weatherText;
    private String weatherTemp;

    public int getCityIndex() {
        return cityIndex;
    }

    public void setCityIndex(int cityIndex) {
        this.cityIndex = cityIndex;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public String getWeatherTemp() {
        return weatherTemp;
    }

    public void setWeatherTemp(String weatherTemp) {
        this.weatherTemp = weatherTemp;
    }
}
