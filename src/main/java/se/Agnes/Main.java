package se.Agnes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.Agnes.AppConfig.AppConfig;
import se.Agnes.model.Charger;
import se.Agnes.model.Speaker;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring Context with your config class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //  call Spring for  bean
        Charger charger = context.getBean(Charger.class);


        //  test constructors injection
       charger.chargePhone();

        //test  setter injection

        Speaker speaker = context.getBean(Speaker.class);
        speaker.play();

    }
}