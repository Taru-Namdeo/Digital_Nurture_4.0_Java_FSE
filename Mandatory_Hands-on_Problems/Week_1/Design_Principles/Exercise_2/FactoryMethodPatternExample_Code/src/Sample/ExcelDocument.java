package Sample;

//Concrete implementation of Document for Excel documents

public class ExcelDocument implements Document {
    
    @Override
    public void open() {
        System.out.println("Excel document opened successfully!");
    }
    
    @Override
    public void save() {
        System.out.println("Excel document saved successfully!");
    }
    
    @Override
    public void close() {
        System.out.println("Excel document closed successfully!");
    }
    
    @Override
    public String getDocumentType() {
        return "Excel Document";
    }
} 