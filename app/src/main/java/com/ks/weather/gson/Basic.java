package com.ks.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 窦浩鹏 on 2020/2/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weathId;

    public Update update;

    public  class Update{
        @SerializedName("loc")
        public String updateTime;
    }




}
