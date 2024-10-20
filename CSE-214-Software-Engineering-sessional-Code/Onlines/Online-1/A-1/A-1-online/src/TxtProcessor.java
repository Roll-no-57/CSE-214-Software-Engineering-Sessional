// TXT Processor
public class TxtProcessor implements DocumentProcessor {
    @Override
    public void LoadDocument(String filename) {
        System.out.println("Loading TXT file: " + filename);
    }

    @Override
    public void SaveDocument(String filename) {
        System.out.println("Saving TXT file: " + filename);
    }
}
