package refugeescode.at.the_accountancy.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
@Service
public class Invoices {
    private HashMap<String, String> hashMap = new HashMap<>();

        public String getInvoice(String illness) {

            hashMap.put("oprations","$10000");
            hashMap.put("water&tee","$20");
            //String treatment = hashMap.get(illness);
            String[] illnesses = illness.split(" ");
            String treatment = Arrays.stream(illnesses)
                    .map(onesymptoms -> hashMap.get(onesymptoms))
                    .filter(e -> e != null)
                    .collect(Collectors.joining(" "));
            if (treatment.isEmpty()) {
                return "0$";
            }
            return treatment;
        }
}
/*

 */