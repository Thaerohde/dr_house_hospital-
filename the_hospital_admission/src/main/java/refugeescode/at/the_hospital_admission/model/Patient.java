package refugeescode.at.the_hospital_admission.model;

import java.util.List;

public class Patient {
    private String patientName;
    private String patientNumber;
    private List<String> symptoms;

    public Patient(String patientName,  List<String> symptoms) {
        this.patientName = patientName;
        this.symptoms = symptoms;
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

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}
