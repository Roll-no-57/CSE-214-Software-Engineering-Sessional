public class DocumentProcessorFactory {
    public static DocumentProcessor getProcessor(String filename) {
        if (filename.endsWith(".docx")) {
            return new DocxProcessor();
        } else if (filename.endsWith(".pdf")) {
            return new PdfProcessor();
        } else if (filename.endsWith(".txt")) {
            return new TxtProcessor();
        } else {
            throw new IllegalArgumentException("Unsupported file type");
        }
    }
}
