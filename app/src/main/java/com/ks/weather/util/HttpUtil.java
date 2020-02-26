package com.ks.weather.util;

/**
 * Created by 窦浩鹏 on 2020/2/26.
 */
import  okhttp3.OkHttpClient;
import okhttp3.Request;
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
