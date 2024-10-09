package InternetConnection;

public class GSM implements InternetConnection {
    @Override
    public void connect() {
        System.out.println("GSM is connecting...");
    }
    public String toString() {
        return "GSM";
    }
}
