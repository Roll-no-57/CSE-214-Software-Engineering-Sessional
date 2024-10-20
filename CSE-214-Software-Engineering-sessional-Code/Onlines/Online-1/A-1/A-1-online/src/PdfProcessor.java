
// PDF Processor
public class PdfProcessor implements DocumentProcessor {
    @Override
    public void LoadDocument(String filename) {
        System.out.println("Loading PDF file: " + filename);
    }

    @Override
    public void SaveDocument(String filename) {
        System.out.println("Saving PDF file: " + filename);
    }
}

