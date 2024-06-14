package com.paola.betplay.tech.domain.entities;

public class Tech {
    private int id;
    private String name;
    private int age;
    private String nationality;
    private int idTeam;
    private String techType;

    public Tech() {}

    public Tech(int id, String name, int age, String nationality, int idTeam, String techType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.idTeam = idTeam;
        this.techType = techType;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }
}