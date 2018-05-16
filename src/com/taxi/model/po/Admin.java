package com.taxi.model.po;

public class Admin {
    private Integer aId;

    private String aAcount;

    private String aPwd;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaAcount() {
        return aAcount;
    }

    public void setaAcount(String aAcount) {
        this.aAcount = aAcount == null ? null : aAcount.trim();
    }

    public String getaPwd() {
        return aPwd;
    }

    public void setaPwd(String aPwd) {
        this.aPwd = aPwd == null ? null : aPwd.trim();
    }
}