package refugeescode.at.the_nursery.nurseryEndpoint;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import refugeescode.at.the_nursery.model.Patient;
import refugeescode.at.the_nursery.model.Treatment;
import refugeescode.at.the_nursery.persistance.NurseRepository;


@RestController
public class patientsEndpoint {
    private NurseRepository nurseRepository;
    private Treatment treatment;
    private RestTemplate restTemplate;

    public patientsEndpoint(NurseRepository nurseRepository, Treatment treatment, RestTemplate restTemplate) {
        this.nurseRepository = nurseRepository;
        this.treatment = treatment;
        this.restTemplate = restTemplate;
    }

    @Value("${accountentUrl}")
    private String accountentUrl;

    @PostMapping("/patients")
    Patient addPatient(@RequestBody Patient patient){
        Patient treatedPatient = treatment.getTreatment(patient);
        nurseRepository.save(treatedPatient);
        restTemplate.postForEntity(accountentUrl,treatedPatient,String.class);
        return treatedPatient;
    }

}
