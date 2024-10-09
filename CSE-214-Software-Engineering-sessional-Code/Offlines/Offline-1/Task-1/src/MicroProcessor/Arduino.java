package MicroProcessor;

public class Arduino implements MicroProcessor {
    @Override
    public void process() {
        System.out.println("Arduino is processing...");
    }
    public String toString() {
        return "Arduino";
    }
}
