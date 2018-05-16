package com.taxi.model.result;

import java.util.List;

/**
 * 饼状图
 * Created by HDL on 2017/11/7.
 */
public class CountUserPieResult {
    private List<String> X;
    private List<Integer> Y;
    private List<Integer> Z;

    public CountUserPieResult() {
    }

    public CountUserPieResult(List<String> x, List<Integer> y, List<Integer> z) {
        X = x;
        Y = y;
        Z = z;
    }

    public List<String> getX() {
        return X;
    }

    public void setX(List<String> x) {
        X = x;
    }

    public List<Integer> getY() {
        return Y;
    }

    public void setY(List<Integer> y) {
        Y = y;
    }

    public List<Integer> getZ() {
        return Z;
    }

    public void setZ(List<Integer> z) {
        Z = z;
    }

    @Override
    public String toString() {
        return "CountUserPieResult{" +
                "X=" + X +
                ", Y=" + Y +
                ", Z=" + Z +
                '}';
    }
}
