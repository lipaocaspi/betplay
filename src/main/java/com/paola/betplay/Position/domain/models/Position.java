package com.paola.betplay.Position.domain.models;

public class Position {
    private int idPosition;
    private String descriptionPosition;

    public Position() {}

    public Position(int idPosition, String descriptionPosition) {
        this.idPosition = idPosition;
        this.descriptionPosition = descriptionPosition;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String getDescriptionPosition() {
        return descriptionPosition;
    }

    public void setDescriptionPosition(String descriptionPosition) {
        this.descriptionPosition = descriptionPosition;
    }
}