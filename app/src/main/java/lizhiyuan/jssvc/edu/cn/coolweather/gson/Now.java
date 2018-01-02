package lizhiyuan.jssvc.edu.cn.coolweather.gson;

/**
 * Created by C515 on 2018/1/2.
 */

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}