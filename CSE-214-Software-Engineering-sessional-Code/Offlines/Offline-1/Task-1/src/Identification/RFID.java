package Identification;

public class RFID implements Identification {
    @Override
    public void identify() {
        System.out.println("RFID is identifying...");
    }
    public String toString() {
        return "RFID";
    }
}
