package com.taxi.model.po;

public class Cars {
    private Integer cId;

    private String cLicensePlate;

    private Integer dId;

    private String cName;

    private String cBuyTime;

    private Integer cPrice;

    private Boolean cIsScrap;

    private String cScrepTime;

    private String cCheckTime;

    private Boolean cIsPassenger;

    private String cInsuranceInfo;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcLicensePlate() {
        return cLicensePlate;
    }

    public void setcLicensePlate(String cLicensePlate) {
        this.cLicensePlate = cLicensePlate == null ? null : cLicensePlate.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcBuyTime() {
        return cBuyTime;
    }

    public void setcBuyTime(String cBuyTime) {
        this.cBuyTime = cBuyTime == null ? null : cBuyTime.trim();
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public Boolean getcIsScrap() {
        return cIsScrap;
    }

    public void setcIsScrap(Boolean cIsScrap) {
        this.cIsScrap = cIsScrap;
    }

    public String getcScrepTime() {
        return cScrepTime;
    }

    public void setcScrepTime(String cScrepTime) {
        this.cScrepTime = cScrepTime == null ? null : cScrepTime.trim();
    }

    public String getcCheckTime() {
        return cCheckTime;
    }

    public void setcCheckTime(String cCheckTime) {
        this.cCheckTime = cCheckTime == null ? null : cCheckTime.trim();
    }

    public Boolean getcIsPassenger() {
        return cIsPassenger;
    }

    public void setcIsPassenger(Boolean cIsPassenger) {
        this.cIsPassenger = cIsPassenger;
    }

    public String getcInsuranceInfo() {
        return cInsuranceInfo;
    }

    public void setcInsuranceInfo(String cInsuranceInfo) {
        this.cInsuranceInfo = cInsuranceInfo == null ? null : cInsuranceInfo.trim();
    }
}