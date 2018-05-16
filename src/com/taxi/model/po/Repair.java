package com.taxi.model.po;

public class Repair {
    private Integer rId;

    private Integer cId;

    private String rTime;

    private Integer rPrice;

    private String rContent;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getrTime() {
        return rTime;
    }

    public void setrTime(String rTime) {
        this.rTime = rTime == null ? null : rTime.trim();
    }

    public Integer getrPrice() {
        return rPrice;
    }

    public void setrPrice(Integer rPrice) {
        this.rPrice = rPrice;
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent == null ? null : rContent.trim();
    }
}