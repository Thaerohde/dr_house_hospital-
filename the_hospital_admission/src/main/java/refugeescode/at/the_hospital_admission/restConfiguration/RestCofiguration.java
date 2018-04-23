package refugeescode.at.the_hospital_admission.restConfiguration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestCofiguration {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
