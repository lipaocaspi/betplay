package com.paola.betplay.Role.domain.models;

public class Role {
    private int idRole;
    private String descriptionRole;

    public Role() {}

    public Role(int idRole, String descriptionRole) {
        this.idRole = idRole;
        this.descriptionRole = descriptionRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }
}
