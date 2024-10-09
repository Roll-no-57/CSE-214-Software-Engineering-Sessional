package InternetConnection;

public class Ethernet implements InternetConnection {
    @Override
    public void connect() {
        System.out.println("Ethernet is connecting...");
    }
    public String toString() {
        return "Ethernet";
    }
}
