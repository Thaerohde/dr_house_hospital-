package refugeescode.at.the_nursery.restConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

public class RestConfiguration {
    @Configuration
    public class RestCofiguration {
        @Bean
        RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }

}
