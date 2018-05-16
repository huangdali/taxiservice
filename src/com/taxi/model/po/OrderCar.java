package com.taxi.model.po;

public class OrderCar {
    private String oId;

    private Integer cId;

    private String oCreateTime;

    private Boolean oIsFinished;

    private String oFinishedTime;

    private Integer oExpectedCharge;

    private Integer oRealCharge;

    private String oContent;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getoCreateTime() {
        return oCreateTime;
    }

    public void setoCreateTime(String oCreateTime) {
        this.oCreateTime = oCreateTime == null ? null : oCreateTime.trim();
    }

    public Boolean getoIsFinished() {
        return oIsFinished;
    }

    public void setoIsFinished(Boolean oIsFinished) {
        this.oIsFinished = oIsFinished;
    }

    public String getoFinishedTime() {
        return oFinishedTime;
    }

    public void setoFinishedTime(String oFinishedTime) {
        this.oFinishedTime = oFinishedTime == null ? null : oFinishedTime.trim();
    }

    public Integer getoExpectedCharge() {
        return oExpectedCharge;
    }

    public void setoExpectedCharge(Integer oExpectedCharge) {
        this.oExpectedCharge = oExpectedCharge;
    }

    public Integer getoRealCharge() {
        return oRealCharge;
    }

    public void setoRealCharge(Integer oRealCharge) {
        this.oRealCharge = oRealCharge;
    }

    public String getoContent() {
        return oContent;
    }

    public void setoContent(String oContent) {
        this.oContent = oContent == null ? null : oContent.trim();
    }
}