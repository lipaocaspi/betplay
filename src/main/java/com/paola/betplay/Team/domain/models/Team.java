package com.paola.betplay.Team.domain.models;

import java.time.LocalDate;

public class Team {
    private int idTeam;
    private String nameTeam;
    private LocalDate dateOfCreationTeam;
    private int playedMatches;
    private int wonMatches;
    private int lostMatches;
    private int tiedMatches;
    private int totalGoals;
    private int goalsScored;
    private int goalsAgainst;
    private int totalPoints;
    private int idCity;

    public Team() {}

    public Team(int idTeam, String nameTeam, LocalDate dateOfCreationTeam, int playedMatches, int wonMatches, int lostMatches, int tiedMatches, int totalGoals, int goalsScored, int goalsAgainst, int totalPoints, int idCity) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.dateOfCreationTeam = dateOfCreationTeam;
        this.playedMatches = playedMatches;
        this.wonMatches = wonMatches;
        this.lostMatches = lostMatches;
        this.tiedMatches = tiedMatches;
        this.totalGoals = totalGoals;
        this.goalsScored = goalsScored;
        this.goalsAgainst = goalsAgainst;
        this.totalPoints = totalPoints;
        this.idCity = idCity;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public LocalDate getDateOfCreationTeam() {
        return dateOfCreationTeam;
    }

    public void setDateOfCreationTeam(LocalDate dateOfCreationTeam) {
        this.dateOfCreationTeam = dateOfCreationTeam;
    }

    public int getPlayedMatches() {
        return playedMatches;
    }

    public void setPlayedMatches(int playedMatches) {
        this.playedMatches = playedMatches;
    }

    public int getWonMatches() {
        return wonMatches;
    }

    public void setWonMatches(int wonMatches) {
        this.wonMatches = wonMatches;
    }

    public int getLostMatches() {
        return lostMatches;
    }

    public void setLostMatches(int lostMatches) {
        this.lostMatches = lostMatches;
    }

    public int getTiedMatches() {
        return tiedMatches;
    }

    public void setTiedMatches(int tiedMatches) {
        this.tiedMatches = tiedMatches;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }
}