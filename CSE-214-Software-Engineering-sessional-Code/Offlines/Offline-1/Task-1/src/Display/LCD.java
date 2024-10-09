package Display;

public class LCD implements Display {
    @Override
    public void display() {
        System.out.println("LCD display is displaying...");
    }
    public String toString() {
        return "LCD";
    }
}
