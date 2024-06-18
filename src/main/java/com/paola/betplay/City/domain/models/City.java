package com.paola.betplay.City.domain.models;

public class City {
    private int id;
    private String name;
    private int idRegion;

    public City() {}

    public City(int id, String name, int idRegion) {
        this.id = id;
        this.name = name;
        this.idRegion = idRegion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }
}