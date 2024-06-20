package com.paola.betplay.Match.domain.models;

import java.time.LocalDate;

public class Match {
    private int idMatch;
    private LocalDate dateMatch;

    public Match() {}

    public Match(int idMatch, LocalDate dateMatch) {
        this.idMatch = idMatch;
        this.dateMatch = dateMatch;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public LocalDate getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(LocalDate dateMatch) {
        this.dateMatch = dateMatch;
    }
}