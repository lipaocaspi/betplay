package com.paola.betplay.Tech.domain.models;

import java.time.LocalDate;

import com.paola.betplay.Person.domain.models.Person;

public class Tech extends Person {
    private int idTech;
    private String degreeTech;
    private LocalDate dateDegreeTech;
    private int idRole;

    public Tech() {}

    public Tech(String idPerson, String namePerson, String lastNamePerson, LocalDate dateOfBirthPerson, String emailPerson, int idCity, int idTech, String degreeTech, LocalDate dateDegreeTech, int idRole) {
        super(idPerson, namePerson, lastNamePerson, dateOfBirthPerson, emailPerson, idCity);
        this.idTech = idTech;
        this.degreeTech = degreeTech;
        this.dateDegreeTech = dateDegreeTech;
        this.idRole = idRole;
    }

    public int getIdTech() {
        return idTech;
    }

    public void setIdTech(int idTech) {
        this.idTech = idTech;
    }

    public String getDegreeTech() {
        return degreeTech;
    }

    public void setDegreeTech(String degreeTech) {
        this.degreeTech = degreeTech;
    }

    public LocalDate getDateDegreeTech() {
        return dateDegreeTech;
    }

    public void setDateDegreeTech(LocalDate dateDegreeTech) {
        this.dateDegreeTech = dateDegreeTech;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }   
}