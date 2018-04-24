package refugeescode.at.the_accountancy.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;




    @Entity
    public class Patient {
        @Id
        @GeneratedValue
        private Long id;
        private String mongoid;
        private String patientNumber;
        private String patientName;
        @ElementCollection(fetch = FetchType.EAGER)
        private List<String> symptoms;
        private String illness;
        private String treatment;
        private String invoice;
        private LocalDate timePayment;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

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

        public String getInvoice() {
            return invoice;
        }

        public void setInvoice(String invoice) {
            this.invoice = invoice;
        }

        public LocalDate getTimePayment() {
            return timePayment;
        }

        public void setTimePayment(LocalDate timePayment) {
            this.timePayment = timePayment;
        }

        public Patient() {
        }

    }
