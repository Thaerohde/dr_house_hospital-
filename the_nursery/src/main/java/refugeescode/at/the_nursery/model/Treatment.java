package refugeescode.at.the_nursery.model;

import org.springframework.stereotype.Component;
@Component
public class Treatment {


    public Patient getTreatment(Patient patient) {
        patient.setTreatment(patient.getIllness().getIllnessName());
        return patient;
    }

}
