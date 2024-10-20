// DOCX Processor
public class DocxProcessor implements DocumentProcessor {
    @Override
    public void LoadDocument(String filename) {
        System.out.println("Loading DOCX file: " + filename);
    }

    @Override
    public void SaveDocument(String filename) {
        System.out.println("Saving DOCX file: " + filename);
    }
}
