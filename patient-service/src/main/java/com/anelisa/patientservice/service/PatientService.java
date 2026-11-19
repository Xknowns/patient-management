package com.anelisa.patientservice.service;

import com.anelisa.patientservice.dto.PatientResponseDTO;
import com.anelisa.patientservice.mapper.PatientMapper;
import com.anelisa.patientservice.model.Patient;
import com.anelisa.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    //Where all business logic and d2 conversion happens for a given request
    //We can add the PatientRepository variable that will give us access to the
    //PatientRepository class and it's methods
    private final PatientRepository patientRepository;

    //constructor of the PatientService class
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
        //this is called Dependency injection
        //PatientService(receives it's dependency)as constructor instead of
        //instantiating the PatientRepository itself by using the "new" keyword
        //this essentially makes our code more modular
        //it's easier to test as we can pass in some mock patientRepository
        //whenever we're constructing the PatientService in out tests.
        //it's also adheres to the principles of inversion control

        //this is a big pattern in spring
    }

    //getPatient is the first method to create in our service
    //it allows us to returns all the Patients in our database
    public List<PatientResponseDTO> getPatients() {
        //remember when we in the service layer, the service layer is going to convert
        //our Domain Entity models into a responseDTO that has specific properties
        //that we want to return to our clients in the frontend
        List<Patient> patients = patientRepository.findAll();
        //now convert a patient domain entity object into a PatientResponseDTO object

        //now some logic of getPatients() service function that converts each
        //of the patients, that we receive back from our Repository to a
        //PatientResponseDTO object

        //we're going to create a helper class that accepts the domain entity model and
        //returns a dto
        return patients.stream()
                .map(PatientMapper::toDTO).toList();
    }
}
