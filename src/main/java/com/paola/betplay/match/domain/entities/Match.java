package com.paola.betplay.match.domain.entities;

public class Match {
    private String date;
    private String teamOne;
    private String teamTwo;
    private int scoreOne;
    private int scoreTwo;
    private int yellowCard;
    private int redCard;

    public Match () {}

    public Match(String date, String teamOne, String teamTwo, int scoreOne, int scoreTwo, int yellowCard, int redCard) {
        this.date = date;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.yellowCard = yellowCard;
        this.redCard = redCard;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public int getScoreOne() {
        return scoreOne;
    }

    public void setScoreOne(int scoreOne) {
        this.scoreOne = scoreOne;
    }

    public int getScoreTwo() {
        return scoreTwo;
    }

    public void setScoreTwo(int scoreTwo) {
        this.scoreTwo = scoreTwo;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }
}