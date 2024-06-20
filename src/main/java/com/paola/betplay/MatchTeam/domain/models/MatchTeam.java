package com.paola.betplay.MatchTeam.domain.models;

public class MatchTeam {
    private int idMatchTeam;
    private int idMatch;
    private int idTeam;
    private int scoreMatchTeam;
    private int yellowCardsMatchTeam;
    private int redCardsMatchTeam;

    public MatchTeam() {}

    public MatchTeam(int idMatchTeam, int idMatch, int idTeam, int scoreMatchTeam, int yellowCardsMatchTeam, int redCardsMatchTeam) {
        this.idMatchTeam = idMatchTeam;
        this.idMatch = idMatch;
        this.idTeam = idTeam;
        this.scoreMatchTeam = scoreMatchTeam;
        this.yellowCardsMatchTeam = yellowCardsMatchTeam;
        this.redCardsMatchTeam = redCardsMatchTeam;
    }

    public int getIdMatchTeam() {
        return idMatchTeam;
    }

    public void setIdMatchTeam(int idMatchTeam) {
        this.idMatchTeam = idMatchTeam;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getScoreMatchTeam() {
        return scoreMatchTeam;
    }

    public void setScoreMatchTeam(int scoreMatchTeam) {
        this.scoreMatchTeam = scoreMatchTeam;
    }

    public int getYellowCardsMatchTeam() {
        return yellowCardsMatchTeam;
    }

    public void setYellowCardsMatchTeam(int yellowCardsMatchTeam) {
        this.yellowCardsMatchTeam = yellowCardsMatchTeam;
    }

    public int getRedCardsMatchTeam() {
        return redCardsMatchTeam;
    }

    public void setRedCardsMatchTeam(int redCardsMatchTeam) {
        this.redCardsMatchTeam = redCardsMatchTeam;
    }
}
