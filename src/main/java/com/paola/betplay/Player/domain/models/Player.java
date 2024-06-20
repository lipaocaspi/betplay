package com.paola.betplay.Player.domain.models;

import java.time.LocalDate;

import com.paola.betplay.Person.domain.models.Person;

public class Player extends Person {
    private int idPlayer;
    private int shirtNumberPlayer;
    private LocalDate dateOfArrivalPlayer;
    private int goalsScoredPlayer;
    private int yellowCardsPlayer;
    private int redCardsPlayer;
    private int idPosition;

    public Player() {}

    public Player(String idPerson, String namePerson, String lastNamePerson, LocalDate dateOfBirthPerson, String emailPerson, int idCity, int idPlayer, int shirtNumberPlayer, LocalDate dateOfArrivalPlayer, int goalsScoredPlayer, int yellowCardsPlayer, int redCardsPlayer, int idPosition) {
        super(idPerson, namePerson, lastNamePerson, dateOfBirthPerson, emailPerson, idCity);
        this.idPlayer = idPlayer;
        this.shirtNumberPlayer = shirtNumberPlayer;
        this.dateOfArrivalPlayer = dateOfArrivalPlayer;
        this.goalsScoredPlayer = goalsScoredPlayer;
        this.yellowCardsPlayer = yellowCardsPlayer;
        this.redCardsPlayer = redCardsPlayer;
        this.idPosition = idPosition;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getShirtNumberPlayer() {
        return shirtNumberPlayer;
    }

    public void setShirtNumberPlayer(int shirtNumberPlayer) {
        this.shirtNumberPlayer = shirtNumberPlayer;
    }

    public LocalDate getDateOfArrivalPlayer() {
        return dateOfArrivalPlayer;
    }

    public void setDateOfArrivalPlayer(LocalDate dateOfArrivalPlayer) {
        this.dateOfArrivalPlayer = dateOfArrivalPlayer;
    }

    public int getGoalsScoredPlayer() {
        return goalsScoredPlayer;
    }

    public void setGoalsScoredPlayer(int goalsScoredPlayer) {
        this.goalsScoredPlayer = goalsScoredPlayer;
    }

    public int getYellowCardsPlayer() {
        return yellowCardsPlayer;
    }

    public void setYellowCardsPlayer(int yellowCardsPlayer) {
        this.yellowCardsPlayer = yellowCardsPlayer;
    }

    public int getRedCardsPlayer() {
        return redCardsPlayer;
    }

    public void setRedCardsPlayer(int redCardsPlayer) {
        this.redCardsPlayer = redCardsPlayer;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }
}
