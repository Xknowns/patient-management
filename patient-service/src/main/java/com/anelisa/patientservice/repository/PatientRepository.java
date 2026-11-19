package com.anelisa.patientservice.repository;

import com.anelisa.patientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//Repository annotation
//This tells spring that this interface is a jpa repository
@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
    //This code creates a PatientRepository that extends the base
    // JpaRepository<Passing an Entity that we want this repository to control(Patient), and the type of it ID>
    // By extending the base JpaRepository we get access to a lot of out of the box CRUD functionalities
    //we'll see this when we implement the service layer that will actually call this PatientRepository

}
