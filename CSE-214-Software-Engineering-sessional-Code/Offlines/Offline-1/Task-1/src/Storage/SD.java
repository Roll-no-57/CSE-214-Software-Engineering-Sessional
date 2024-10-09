package Storage;

public class SD implements Storage {
    @Override
    public void store() {
        System.out.println("SD storage is storing...");
    }
    public String toString() {
        return "SD";
    }
}
