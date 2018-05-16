package com.taxi.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具
 * Created by HDL on 2017/10/30.
 */
public class DateUtils {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat yearMonthFormat = new SimpleDateFormat("yyyy-MM");
    private static SimpleDateFormat monthFormat = new SimpleDateFormat("MM");

    /**
     * 根据毫秒值获取月份
     *
     * @param time
     * @return
     * @throws ParseException
     */
    public static int getMonth(long time) {
        try {
            return Integer.parseInt(monthFormat.format(new Date(time)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    /**
     * 根据毫秒值获取年、月
     *
     * @param time
     * @return
     * @throws ParseException
     */
    public static String getYearMonth(long time) {
        return yearMonthFormat.format(new Date(time));
    }

    /**
     * 获取时间
     *
     * @param time
     * @return
     */
    public static String formartTime(Long time) {
        return dateFormat.format(new Date(time));
    }
}
