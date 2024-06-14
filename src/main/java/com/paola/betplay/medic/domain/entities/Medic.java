package com.paola.betplay.medic.domain.entities;

public class Medic {
    private int id;
    private String name;
    private int age;
    private String nationality;
    private int idTeam;
    private String medicType;
    private String degree;
    private int experience;

    public Medic() {}

    public Medic(int id, String name, int age, String nationality, int idTeam, String medicType, String degree, int experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.idTeam = idTeam;
        this.medicType = medicType;
        this.degree = degree;
        this.experience = experience;
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

    public String getMedicType() {
        return medicType;
    }

    public void setMedicType(String medicType) {
        this.medicType = medicType;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}