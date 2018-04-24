package refugeescode.at.the_diagnose_room.controller;


import org.springframework.stereotype.Controller;
import refugeescode.at.the_diagnose_room.model.Patient;
import refugeescode.at.the_diagnose_room.parser.DrHouseParser;

import java.util.List;
import java.util.Map;


@Controller
public class DrHouse {
    private DrHouseParser drHouseParser;

    public DrHouse(DrHouseParser drHouseParser) {
        this.drHouseParser = drHouseParser;
    }

    public Patient diagnose(Patient patient) {
        Map<String,List<String>> illnesses = drHouseParser.getDiagnoses();
        List<String> symptoms = patient.getSymptoms();
        String patientsIlness = illnesses.entrySet()
                .stream()
                .filter(illness -> illness.equals(symptoms))
                .map(e -> e.getKey())
                .findFirst()
                .orElse("lupus");
        patient.setIllness(patientsIlness);
        return patient;


    }
}

