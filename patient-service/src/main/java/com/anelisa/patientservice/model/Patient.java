package com.anelisa.patientservice.model;
//The core responsibility of a patient service is to handle the patients
//It makes sense to make an Entity to represent a patient Object in our database.
//This package is handling all the domain entities

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;


@Entity
public class Patient {

    //since we're going to store a patient entity in the database
    //each of the properties of a patient
    //are going to corresponds to a column in the Patient Table
    //WE'RE GOING TO HAVE A PATIENT TABLE IN THE DATABASE THAT CORRESPONDS TO THIS PATIENT OBJECT
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    //the id will be auto handled by spring jpa and database before us doing anything

    //next thing to store is a Patient's name
    @NotNull
    private String name;
    //This will add a name column in our database
    //or each of the Patient records that we've added to Patient Table
    //IT MEANS if we'll try to persist or see a Patient Record to the database
    //is going to fail if the name property for the given Patient doesn't have
    //a value in it.
    @NotNull
    @Email
    //This is just some additional validation to make sure every email address is unique
    @Column(unique = true)
    private String email;

    @NotNull
    private String address;

    @NotNull
    //by specifying the type of this property as LocalDate-we'll see the timestamp
    //to the database as a POST to string
    private LocalDate dateOfBirth;

    @NotNull
    private String registeredDate;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

}
