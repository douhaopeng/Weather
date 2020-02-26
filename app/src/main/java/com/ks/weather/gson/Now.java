package com.ks.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 窦浩鹏 on 2020/2/26.
 */

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
