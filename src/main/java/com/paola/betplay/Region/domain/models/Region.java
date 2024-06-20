package com.paola.betplay.Region.domain.models;

public class Region {
    private int idRegion;
    private String nameRegion;
    private int idCountry;

    public Region() {}

    public Region(int idRegion, String nameRegion, int idCountry) {
        this.idRegion = idRegion;
        this.nameRegion = nameRegion;
        this.idCountry = idCountry;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
}