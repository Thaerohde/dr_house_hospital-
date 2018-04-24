package refugeescode.at.the_diagnose_room.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DrHouseParserTest {

    @Autowired
    private DrHouseParser parser;

    @Test
    void getDiagnoses() {
        Map<String, List<String>> diagnoses = parser.getDiagnoses();
        Assertions.assertFalse(diagnoses.isEmpty());
    }
}