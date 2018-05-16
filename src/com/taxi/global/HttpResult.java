package com.taxi.global;

/**
 * http放回结果
 * Created by HDL on 2017/10/23.
 */
public class HttpResult {
    private int code=0;
    private String msg="success";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
