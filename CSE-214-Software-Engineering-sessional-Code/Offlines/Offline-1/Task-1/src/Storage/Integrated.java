package Storage;

public class Integrated implements Storage {
    @Override
    public void store() {
        System.out.println("Integrated storage is storing...");
    }
    public String toString() {
        return "Integrated";
    }
}
