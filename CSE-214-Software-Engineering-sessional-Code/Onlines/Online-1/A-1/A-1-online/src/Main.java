public class Main {
    public static void processFile(String filename) {
        DocumentProcessor processor = DocumentProcessorFactory.getProcessor(filename);
        processor.LoadDocument(filename);
        processor.SaveDocument(filename);
    }

    public static void main(String[] args) {
        String file1 = "example.docx";
        processFile(file1);

        String file2 = "report.pdf";
        processFile(file2);

        String file3 = "notes.txt";
        processFile(file3);
    }
}
