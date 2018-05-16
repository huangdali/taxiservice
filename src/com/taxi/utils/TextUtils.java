package com.taxi.utils;

/**
 * 非空判断
 * Created by HDL on 2017/11/12.
 */
public class TextUtils {
    public static boolean isEntry(String str) {
        return str == null || "".equals(str);
    }
}
