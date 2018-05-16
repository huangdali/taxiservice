package com.taxi.utils;

import com.google.gson.Gson;

/**
 * 单例gson
 * Created by HDL on 2017/11/11.
 */
public class GsonUtils {
    private static Gson gson;

    private GsonUtils() {
    }

    public static Gson getGson() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }
}
