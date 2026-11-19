package com.anelisa.patientservice.dto;

//This DTO is going to contain all the properties that we want to return to the frontend client

public class PatientResponseDTO {
    //add the things that we want to return in the request
    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;

    //One of the reasons we use a DTO
    //Because if we try to convert a Patient entity model into JSON
    //which is what typical HTTP request would use to return data in the response
    //we could encounter some issues trying to convert these complicated types
    //into a JSON string, "whereas if we use a DTO and these more primitive types
    //it's easy for us to manage those types of conversions bcuz we're returning
    //things as simple Strings

    //notice that in the Patient entity we stored the registeredDate but did not
    //return it as part of the PatientResponseDTO
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
