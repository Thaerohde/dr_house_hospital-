package refugeescode.at.the_accountancy.presistance;

import org.springframework.data.jpa.repository.JpaRepository;
import refugeescode.at.the_accountancy.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
