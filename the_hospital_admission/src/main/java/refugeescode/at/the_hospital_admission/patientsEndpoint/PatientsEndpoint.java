package refugeescode.at.the_hospital_admission.patientsEndpoint;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import refugeescode.at.the_hospital_admission.model.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController

public class PatientsEndpoint {
    private Patient patient;
    private String symptom;

    private RestTemplate restTemplate;

    public PatientsEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Value("${diagnosisUrl}")
    String diagnosisUrl;


    @PostMapping("/patients")
    Patient post(@RequestBody Patient patient) {
        patient.setPatientNumber(UUID.randomUUID().toString());
        restTemplate.postForEntity(diagnosisUrl, patient, String.class);
        return patient;
    }
}
