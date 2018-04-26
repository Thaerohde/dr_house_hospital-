package at.refugeescode.doctorhausui.model;

import java.util.List;

public class Patient {
    private String patientNumaber;
    private String patientName;
    private List<String> symptoms;

    public String getPatientNumaber() {
        return patientNumaber;
    }

    public void setPatientNumaber(String patientNumaber) {
        this.patientNumaber = patientNumaber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}
