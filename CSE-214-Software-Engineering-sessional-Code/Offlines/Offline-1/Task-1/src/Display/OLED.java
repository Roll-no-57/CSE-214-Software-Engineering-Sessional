package Display;

public class OLED implements Display{
    @Override
    public void display() {
        System.out.println("Oled display is displaying...");
    }
    public String toString() {
        return "Oled";
    }
}
