package com.octo.android.robospice.retrofit.test.model;

import java.util.List;

public class Day {
    private String weather_code;
    private String weather_text;
    private List< Wind > wind;

    public String getWeather_code() {
        return this.weather_code;
    }

    public void setWeather_code( String weather_code ) {
        this.weather_code = weather_code;
    }

    public String getWeather_text() {
        return this.weather_text;
    }

    public void setWeather_text( String weather_text ) {
        this.weather_text = weather_text;
    }

    public List< Wind > getWind() {
        return this.wind;
    }

    public void setWind( List< Wind > wind ) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "Day [weather_code=" + weather_code + ", weather_text=" + weather_text + ", wind=" + wind + "]";
    }

}
