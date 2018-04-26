package at.refugeescode.doctorhausui.view;

import at.refugeescode.doctorhausui.model.FinalResult;
import at.refugeescode.doctorhausui.services.Sender;
import at.refugeescode.doctorhausui.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class Endpoint{

    private Sender sender;
    public Endpoint(Sender sender) {
        this.sender = sender;
    }

    @GetMapping("/inserPaitients")
    String showHome(){
        return "home";
    }

    @GetMapping("/invoices")
    String showInvoices(){
        return "invoices";
    }


    @PostMapping
    String bro(Patient patient){
        sender.addPatient(patient);
        return "redirect:/invoices";
    }

    @ModelAttribute("patients")
    public Patient patients(){
        return new Patient();
    }
    @ModelAttribute("patientsInvoices")
    public List<FinalResult> patientsInvoices(){
        return sender.getPatientsInvoices();
    }

    @GetMapping
    String show(){

        return "layout";
    }
}
