package refugeescode.at.the_diagnose_room.drhousediagnoseroomendpoint;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import refugeescode.at.the_diagnose_room.controller.DrHouse;
import refugeescode.at.the_diagnose_room.model.Patient;

@RestController
@RequestMapping("/diagnoseRoom")
public class DrHouseDiagnosesRoomEndpoint {
    RestTemplate restTemplate;
    @Value("${nurseurl}")
    String nurseurl;
    private DrHouse drHouse;

    public DrHouseDiagnosesRoomEndpoint(DrHouse drHouse, RestTemplate restTemplate) {
        this.drHouse = drHouse;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public Patient findTheIllness(@RequestBody Patient patient) {
        Patient diagnosePatient = drHouse.diagnose(patient);
        restTemplate.postForEntity(nurseurl, diagnosePatient, String.class);
        return diagnosePatient;

    }
}