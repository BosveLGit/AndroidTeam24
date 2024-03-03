package com.example.homework3;

public class Country {

    private String country;
    private int iconFlag;

    public Country(String country, int iconFlag) {
        this.country = country;
        this.iconFlag = iconFlag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getIconFlag() {
        return iconFlag;
    }

    public void setIconFlag(int iconFlag) {
        this.iconFlag = iconFlag;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", iconFlag=" + iconFlag +
                '}';
    }
}
