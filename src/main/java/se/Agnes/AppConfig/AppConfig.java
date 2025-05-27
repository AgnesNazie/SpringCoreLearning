package se.Agnes.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.Agnes.model.Charger;
import se.Agnes.model.Phone;

@Configuration

public class AppConfig {
    @Bean
    public Charger charger() {
        return new Charger(phone());
    }

    @Bean
    public Phone phone() {
        return new Phone();
    }
}
