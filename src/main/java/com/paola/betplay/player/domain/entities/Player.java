package com.paola.betplay.player.domain.entities;

public class Player {
    private int id;
    private String name;
    private int age;
    private String nationality;
    private int idTeam;
    private int shirtNumber;
    private String role;
    private String dateOfArrival;
    private int goalsScored;
    private int yellowCards;
    private int redCards;

    public Player() {}

    public Player(int id, String name, int age, String nationality, int idTeam, int shirtNumber, String role, String dateOfArrival, int goalsScored, int yellowCards, int redCards) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.idTeam = idTeam;
        this.shirtNumber = shirtNumber;
        this.role = role;
        this.dateOfArrival = dateOfArrival;
        this.goalsScored = goalsScored;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
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

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }
}