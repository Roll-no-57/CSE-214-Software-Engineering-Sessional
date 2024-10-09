package Identification;

public class NFC implements Identification {
    @Override
    public void identify() {
        System.out.println("NFC is identifying...");
    }
    public String toString() {
        return "NFC";
    }
}
