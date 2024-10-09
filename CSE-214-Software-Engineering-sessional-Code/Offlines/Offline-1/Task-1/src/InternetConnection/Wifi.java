package InternetConnection;

public class Wifi implements InternetConnection {
    @Override
    public void connect() {
        System.out.println("Wifi is connecting...");
    }
    public String toString() {
        return "Wifi";
    }
}
