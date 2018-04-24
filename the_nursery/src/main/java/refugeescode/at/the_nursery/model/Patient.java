package refugeescode.at.the_nursery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


    @Document
    public class Patient {
        @Id
        private String mongoid;
        private String patientNumber;
        private String patientsName;
        private List<String> symptoms;
        private String illness;
        private String treatment;

        public String getMongoid() {
            return mongoid;
        }

        public void setMongoid(String mongoid) {
            this.mongoid = mongoid;
        }

        public String getPatientNumber() {
            return patientNumber;
        }

        public void setPatientNumber(String patientNumber) {
            this.patientNumber = patientNumber;
        }

        public String getPatientsName() {
            return patientsName;
        }

        public void setPatientsName(String patientsName) {
            this.patientsName = patientsName;
        }

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

        public String getTreatment() {
            return treatment;
        }

        public void setTreatment(String treatment) {
            this.treatment = treatment;
        }
    }
