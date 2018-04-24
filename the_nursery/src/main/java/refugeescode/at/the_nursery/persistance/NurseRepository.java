package refugeescode.at.the_nursery.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import refugeescode.at.the_nursery.model.Patient;

import java.util.Optional;

public interface NurseRepository extends MongoRepository<Patient, String> {
    Optional<Patient> findById(String id);
}

