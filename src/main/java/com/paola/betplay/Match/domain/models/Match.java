package com.paola.betplay.Match.domain.models;

public class Match {
    private int idMatch;
    private String dateMatch;

    public Match() {}

    public Match(String dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Match(int idMatch, String dateMatch) {
        this.idMatch = idMatch;
        this.dateMatch = dateMatch;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public String getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(String dateMatch) {
        this.dateMatch = dateMatch;
    }
}