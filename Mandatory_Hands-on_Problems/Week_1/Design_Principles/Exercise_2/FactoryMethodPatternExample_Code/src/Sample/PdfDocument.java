package Sample;
//Concrete implementation of Document for PDF documents
public class PdfDocument implements Document {
    
    @Override
    public void open() {
        System.out.println("PDF document opened successfully!");
    }
    
    @Override
    public void save() {
        System.out.println("PDF document saved successfully!");
    }
    
    @Override
    public void close() {
        System.out.println("PDF document closed successfully!");
    }
    
    @Override
    public String getDocumentType() {
        return "PDF Document";
    }
} 