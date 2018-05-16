package com.taxi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性配置文件工具
 * Created by HDL on 2017/11/18.
 */
public class PropertiesUtils {
    private static PropertiesUtils propertiesUtils;

    private PropertiesUtils() {
    }

    public static PropertiesUtils getInstance() {
        synchronized (PropertiesUtils.class) {
            if (propertiesUtils == null) {
                propertiesUtils = new PropertiesUtils();
            }
        }
        return propertiesUtils;
    }

    /**
     * 通过属性key获取属性值
     *
     * @param propertiesKey
     * @return
     */
    public String getValueByKey(String propertiesKey) {
        String value = "";
        try {
            Properties pps = new Properties();
            InputStream is = getClass().getClassLoader().getResourceAsStream("config/config.properties");
            pps.load(is);
            value = pps.getProperty(propertiesKey);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(PropertiesUtils.getInstance().getValueByKey("baseUrl"));
    }
}
