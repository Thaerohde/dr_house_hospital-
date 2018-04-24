package refugeescode.at.the_nursery.service;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class Treatment {

    public String getTreatment(String illness) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Fiber", "Aspreen");
        hashMap.put("Hust", "Herbste");

        String[] illnesses = illness.split(" ");
        String treatment = Arrays.stream(illnesses)
                .map(onesymptoms -> hashMap.get(onesymptoms))
                .filter(e -> e != null)
                .collect(Collectors.joining(" "));
        if (treatment.isEmpty()) {
            return null;
        }
        return treatment;
    }
}

