package se.Agnes.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.Agnes.model.Bluetooth;
import se.Agnes.model.Charger;
import se.Agnes.model.Phone;
import se.Agnes.model.Speaker;

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
    @Bean
    public Bluetooth bluetooth(){
        return new Bluetooth();
    }
    @Bean
    public Speaker speaker (){
        Speaker speaker = new Speaker();
        speaker.setBluetooth(bluetooth()); // Setter Injection
        return speaker;

    }
}
