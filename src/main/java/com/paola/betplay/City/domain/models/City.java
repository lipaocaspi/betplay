package com.paola.betplay.City.domain.models;

public class City {
    private int idCity;
    private String nameCity;
    private int idRegion;

    public City() {}

    public City(int idCity, String nameCity, int idRegion) {
        this.idCity = idCity;
        this.nameCity = nameCity;
        this.idRegion = idRegion;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }
}