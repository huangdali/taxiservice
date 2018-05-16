package com.taxi.model.po;

public class Finance {
    private Integer fId;

    private Integer fPrice;

    private String fTime;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getfPrice() {
        return fPrice;
    }

    public void setfPrice(Integer fPrice) {
        this.fPrice = fPrice;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime == null ? null : fTime.trim();
    }
}