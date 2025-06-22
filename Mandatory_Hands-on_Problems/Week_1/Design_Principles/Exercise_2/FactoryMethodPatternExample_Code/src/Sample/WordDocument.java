package Sample;

//Concrete implementation of Document for Word documents
public class WordDocument implements Document {
    
    @Override
    public void open() {
        System.out.println("Word document opened successfully!");
    }
    
    @Override
    public void save() {
        System.out.println("Word document saved successfully!");
    }
    
    @Override
    public void close() {
        System.out.println("Word document closed successfully!");
    }
    
    @Override
    public String getDocumentType() {
        return "Word Document";
    }
} 