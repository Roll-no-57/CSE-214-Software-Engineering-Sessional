package Controller;

public class TouchScreenBased implements Controller {
    @Override
    public void control() {
        System.out.println("TouchScreenBased input is controlling...");
    }
    public String toString() {
        return "TouchScreenBased";
    }
}
