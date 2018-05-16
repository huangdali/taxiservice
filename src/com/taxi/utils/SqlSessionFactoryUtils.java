package com.taxi.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * 提供sqlsesion
 * Created by HDL on 2017/1/15.
 */
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory factory;

    public static SqlSessionFactory newInstance() throws IOException {
        String resuorce = "config/SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(resuorce);
        factory = new SqlSessionFactoryBuilder().build(is);
        return factory;
    }
}
