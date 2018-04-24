package refugeescode.at.the_accountancy.accountancyEndpoint;


import org.aspectj.apache.bcel.Repository;
import org.springframework.web.bind.annotation.*;
import refugeescode.at.the_accountancy.model.Patient;
import refugeescode.at.the_accountancy.presistance.PatientRepository;
import refugeescode.at.the_accountancy.service.Invoices;


import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/patients")
public class PatientsEndpoint {
    private Invoices invoices;
    private PatientRepository patientRepository;

    public PatientsEndpoint(Invoices invoices,PatientRepository patientRepository) {
        this.invoices = invoices;
        this.patientRepository = patientRepository;
    }

    @PostMapping
    Patient getPaiets(@RequestBody Patient patients){
        String treatment = patients.getTreatment();
        String invoice = invoices.getInvoice(treatment);
        System.out.println(invoice);
        System.out.println(treatment);
        patients.setInvoice(invoice);
        patients.setTimePayment(LocalDate.now());
        patientRepository.save(patients);
        System.out.println(patients.getTimePayment());
        return patients;
    }
    @GetMapping
    List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
}

