package MicroProcessor;

public class ATMega implements MicroProcessor {
    @Override
    public void process() {
        System.out.println("ATMega is processing...");
    }
    public String toString() {
        return "ATMega";
    }
}
