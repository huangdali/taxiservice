package com.taxi.model.po;

public class Driver {
    private Integer dId;

    private String dName;

    private String dPwd;

    private Boolean dSex;

    private String dBirthday;

    private String dPhone;

    private String dLicenseValidity;

    private Boolean dIsTranin;

    private String dAddress;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdPwd() {
        return dPwd;
    }

    public void setdPwd(String dPwd) {
        this.dPwd = dPwd == null ? null : dPwd.trim();
    }

    public Boolean getdSex() {
        return dSex;
    }

    public void setdSex(Boolean dSex) {
        this.dSex = dSex;
    }

    public String getdBirthday() {
        return dBirthday;
    }

    public void setdBirthday(String dBirthday) {
        this.dBirthday = dBirthday == null ? null : dBirthday.trim();
    }

    public String getdPhone() {
        return dPhone;
    }

    public void setdPhone(String dPhone) {
        this.dPhone = dPhone == null ? null : dPhone.trim();
    }

    public String getdLicenseValidity() {
        return dLicenseValidity;
    }

    public void setdLicenseValidity(String dLicenseValidity) {
        this.dLicenseValidity = dLicenseValidity == null ? null : dLicenseValidity.trim();
    }

    public Boolean getdIsTranin() {
        return dIsTranin;
    }

    public void setdIsTranin(Boolean dIsTranin) {
        this.dIsTranin = dIsTranin;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress == null ? null : dAddress.trim();
    }
}