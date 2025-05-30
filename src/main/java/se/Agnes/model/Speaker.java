package se.Agnes.model;

public class Speaker {
    private Bluetooth bluetooth;
    public void setBluetooth(Bluetooth bluetooth){
        this.bluetooth = bluetooth;
        System.out.println("Speaker successfully connected to Bluetooth");
    }
    public void play() {
        System.out.println("Playing sound via speaker...");
        bluetooth.bluetoothSpeaker(); // Use injected Bluetooth
    }
}
