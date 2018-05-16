package com.taxi.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 返回json
 * Created by HDL on 2017/11/11.
 */
public class PrintJsonUtils {
    private static PrintWriter pw;

    /**
     * 打印json
     *
     * @param response
     * @param result
     * @throws IOException
     */
    public static void out(HttpServletResponse response, Object result) throws IOException {
        System.out.println("result:"+GsonUtils.getGson().toJson(result));
        pw = response.getWriter();
        pw.write(GsonUtils.getGson().toJson(result));
        pw.close();
    }
}
