package refugeescode.at.the_nursery.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;
import refugeescode.at.the_nursery.model.Patient;

public interface NurseRepository extends MongoRepository<Patient, Long> {
}
