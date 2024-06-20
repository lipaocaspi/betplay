package com.paola.betplay.Person.domain.models;

import java.time.LocalDate;

public class Person {
    private String idPerson;
    private String namePerson;
    private String lastNamePerson;
    private LocalDate dateOfBirthPerson;
    private String emailPerson;
    private int idCity;

    public Person() {}

    public Person(String idPerson, String namePerson, String lastNamePerson, LocalDate dateOfBirthPerson, String emailPerson, int idCity) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.lastNamePerson = lastNamePerson;
        this.dateOfBirthPerson = dateOfBirthPerson;
        this.emailPerson = emailPerson;
        this.idCity = idCity;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    public LocalDate getDateOfBirthPerson() {
        return dateOfBirthPerson;
    }

    public void setDateOfBirthPerson(LocalDate dateOfBirthPerson) {
        this.dateOfBirthPerson = dateOfBirthPerson;
    }

    public String getEmailPerson() {
        return emailPerson;
    }

    public void setEmailPerson(String emailPerson) {
        this.emailPerson = emailPerson;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }
}
