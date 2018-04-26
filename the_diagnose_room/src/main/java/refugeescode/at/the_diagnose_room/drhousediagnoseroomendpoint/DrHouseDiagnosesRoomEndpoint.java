package refugeescode.at.the_diagnose_room.drhousediagnoseroomendpoint;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import refugeescode.at.the_diagnose_room.controller.DrHouse;
import refugeescode.at.the_diagnose_room.model.Patient;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/diagnoseRoom")
public class DrHouseDiagnosesRoomEndpoint {
    RestTemplate restTemplate;
    @Value("${nurseurl}")
    String nurseurl;
    private DrHouse drHouse;
    private List<Patient> patients = new ArrayList<>();

    public DrHouseDiagnosesRoomEndpoint(DrHouse drHouse, RestTemplate restTemplate) {
        this.drHouse = drHouse;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public Patient findTheIllness(@RequestBody Patient patient) {
        Patient diagnosePatient = drHouse.diagnose(patient);
        patients.add(diagnosePatient);
        restTemplate.postForEntity(nurseurl, diagnosePatient, Patient.class);
        return diagnosePatient;

    }
    @GetMapping
    List<Patient> get(){
        return patients;
    }
}