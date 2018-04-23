package refugeescode.at.the_diagnose_room.drHouseDiagnoseRoomEndpoint;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import refugeescode.at.the_diagnose_room.controller.DrHouse;
import refugeescode.at.the_diagnose_room.model.Patient;

@RestController
@RequestMapping("/diagnoseRoom")
public class DrHouseDiagnosesRoomEndpoint {
    private DrHouse drHouse;
    public DrHouseDiagnosesRoomEndpoint(DrHouse drHouse) {
        this.drHouse = drHouse;
    }

   @PostMapping
   public Patient findTheIllness(@RequestBody Patient patient){
   return drHouse.diagnose(patient);
   }

}
