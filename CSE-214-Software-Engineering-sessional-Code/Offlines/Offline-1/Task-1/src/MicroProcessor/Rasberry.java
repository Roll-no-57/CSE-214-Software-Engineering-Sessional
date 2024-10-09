package MicroProcessor;

public class Rasberry implements MicroProcessor {
    @Override
    public void process() {
        System.out.println("Rasberry is processing...");
    }
    public String toString() {
        return "Rasberry";
    }
}
