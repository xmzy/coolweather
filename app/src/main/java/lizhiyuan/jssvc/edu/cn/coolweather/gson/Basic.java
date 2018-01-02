package lizhiyuan.jssvc.edu.cn.coolweather.gson;

/**
 * Created by C515 on 2018/1/2.
 */

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}