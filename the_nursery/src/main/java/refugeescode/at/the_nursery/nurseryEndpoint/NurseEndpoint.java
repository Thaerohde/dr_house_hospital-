package refugeescode.at.the_nursery.nurseryEndpoint;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import refugeescode.at.the_nursery.model.Patient;
import refugeescode.at.the_nursery.persistance.NurseRepository;
import refugeescode.at.the_nursery.service.Treatment;

import java.util.List;


@RestController
@RequestMapping("/patients")
public class NurseEndpoint {
    private NurseRepository nurseRepository;
    private Treatment treatment;
    private RestTemplate restTemplate;

    @Value("${accountancyurl}")
    private String accountancyurl;

    public NurseEndpoint(NurseRepository nurseRepository, Treatment treatment, RestTemplate restTemplate) {
        this.nurseRepository = nurseRepository;
        this.treatment = treatment;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    Patient giveTreatment(@RequestBody Patient patients) {
        String illness = patients.getIllness();
        //cleaning
        String nurseTreatment = treatment.getTreatment(illness);
        patients.setTreatment(nurseTreatment);
        System.out.println(patients);
        System.out.println("this is testing" + nurseTreatment);
        nurseRepository.save(patients);

        //cleaning
        restTemplate.postForEntity(accountancyurl, patients, Patient.class);
        return patients;
    }
    @GetMapping
    List<Patient> get(){
        return nurseRepository.findAll();
    }
}