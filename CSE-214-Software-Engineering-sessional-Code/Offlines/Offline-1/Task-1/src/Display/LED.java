package Display;

public class LED implements Display {
    @Override
    public void display() {
        System.out.println("LED display is displaying...");
    }
    public String toString() {
        return "LED";
    }
}
