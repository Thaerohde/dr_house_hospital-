package refugeescode.at.the_accountancy.model;

import java.time.LocalDateTime;
import java.util.List;

public class Patient {


    private String patientName;
    private String patientNumber;
    private List<Symptom> symptoms;
    private String treatment;
    private Illness illness;
    private LocalDateTime dateTime;

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientNumber='" + patientNumber + '\'' +
                ", symptoms=" + symptoms +
                ", treatment='" + treatment + '\'' +
                ", illness=" + illness +
                ", dateTime=" + dateTime +
                ", invoice=" + invoice +
                '}';
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    private Integer invoice;

    public String getTreatment() {
        return treatment;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public String setTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String setTreatment(Illness illness) {
        return treatment;
    }


    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }


    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
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
