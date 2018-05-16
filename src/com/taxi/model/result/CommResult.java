package com.taxi.model.result;

import com.taxi.global.HttpResult;

/**
 * 用户查询结果类
 * Created by HDL on 2017/11/5.
 */
public class CommResult<T> extends HttpResult {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + " CommResult{" +
                "data=" + data +
                '}';
    }
}
