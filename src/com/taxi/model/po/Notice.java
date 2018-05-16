package com.taxi.model.po;

public class Notice {
    private Integer nId;

    private Integer aId;

    private String nTime;

    private Integer nBrowse;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getnTime() {
        return nTime;
    }

    public void setnTime(String nTime) {
        this.nTime = nTime == null ? null : nTime.trim();
    }

    public Integer getnBrowse() {
        return nBrowse;
    }

    public void setnBrowse(Integer nBrowse) {
        this.nBrowse = nBrowse;
    }
}