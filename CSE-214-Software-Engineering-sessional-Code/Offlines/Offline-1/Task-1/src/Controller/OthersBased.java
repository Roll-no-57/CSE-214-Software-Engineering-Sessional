package Controller;

public class OthersBased implements Controller {
    @Override
    public void control() {
        System.out.println("OthersBased input is controlling...");
    }
    public String toString() {
        return "OthersBased";
    }
}

