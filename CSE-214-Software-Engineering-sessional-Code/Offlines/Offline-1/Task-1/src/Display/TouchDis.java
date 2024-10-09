package Display;

public class TouchDis implements Display {
    @Override
    public void display() {
        System.out.println("Touch Display is displaying...");
    }
    public String toString() {
        return "Touch Display";
    }
}
