package com.paola.betplay.Staff.domain.models;

public class Staff {
    private int idStaff;
    private int idTeam;
    private int idPerson;

    public Staff() {}

    public Staff(int idStaff, int idTeam, int idPerson) {
        this.idStaff = idStaff;
        this.idTeam = idTeam;
        this.idPerson = idPerson;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
}
