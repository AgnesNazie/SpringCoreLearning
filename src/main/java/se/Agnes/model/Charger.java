package se.Agnes.model;

public class Charger {
    private Phone phone;

    public Charger ( Phone phone){
        this.phone = phone;
    }
    public void chargePhone() {
        System.out.println(" Charging the phone...");
        phone.makeCall();
    }
}
