package Sample;
/**
 * Main class to demonstrate the Factory Method Pattern implementation
 * for document management system
 */
public class DocumentManagementSystem {
    
    public static void main(String[] args) {
        System.out.println("=== Document Management System ===");
        
        // Create different document factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        
        // Process different types of documents using the factory method
        System.out.println("Processing Word Document:");
        wordFactory.processDocument();
        
        System.out.println("Processing PDF Document:");
        pdfFactory.processDocument();
        
        System.out.println("Processing Excel Document:");
        excelFactory.processDocument();
        
        // Demonstrate direct document creation and usage
        System.out.println("=== Direct Document Creation Example ===");
        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();
        
        System.out.println("Word Document Type: " + wordDoc.getDocumentType());
        System.out.println("PDF Document Type: " + pdfDoc.getDocumentType());
        System.out.println("Excel Document Type: " + excelDoc.getDocumentType());
        
    }
}