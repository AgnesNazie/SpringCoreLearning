package se.Agnes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.Agnes.AppConfig.AppConfig;
import se.Agnes.model.Charger;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring Context with your config class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //  call Spring for  bean
        Charger charger = context.getBean(Charger.class);

        //  test if it works
        charger.chargePhone();

    }
}