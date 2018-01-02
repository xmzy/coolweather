package lizhiyuan.jssvc.edu.cn.coolweather.gson;

/**
 * Created by C515 on 2018/1/2.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

