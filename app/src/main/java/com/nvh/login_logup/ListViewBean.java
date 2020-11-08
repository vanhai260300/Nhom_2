package com.nvh.login_logup;

public class ListViewBean {
    int image;
    String langName;
    String moTa;
    String tiMe;

    public ListViewBean() {
    }

    public ListViewBean(int image,String langName,String moTa,String tiMe) {
        this.image = image;
        this.langName=langName;
        this.moTa=moTa;
        this.tiMe=tiMe;
    }

    public int getImage() {
        return image;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getTiMe() {
        return tiMe;
    }

    public void setTiMe(String langName) {
        this.tiMe = tiMe;
    }
}
