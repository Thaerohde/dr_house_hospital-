package at.refugeescode.doctorhausui.services;

import at.refugeescode.doctorhausui.model.FinalResult;
import at.refugeescode.doctorhausui.model.Patient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class Sender {
    private RestTemplate restTemplate;

    @Value("${admission.url}")
    String admissionurl;

    @Value("${accountancy.url}")
    String accountancyUrl;

    public Sender(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void addPatient(Patient patient){
        restTemplate.postForObject(admissionurl, patient,Patient.class);
    }
    public List<FinalResult> getPatientsInvoices(){
        return Arrays.asList(restTemplate.getForObject(accountancyUrl,FinalResult[].class));
    }
}
