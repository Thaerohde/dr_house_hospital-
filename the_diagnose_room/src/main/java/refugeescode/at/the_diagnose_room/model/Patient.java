package refugeescode.at.the_diagnose_room.model;

import java.util.List;

public class Patient {
    private String patientName;

    public Patient(String patientName, String patientNumber, List<String> symptoms) {
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.symptoms = symptoms;
    }

    private String patientNumber;
    private List<String> symptoms;
    private String illness;


    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }


    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }




    public Patient() {

    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

}
