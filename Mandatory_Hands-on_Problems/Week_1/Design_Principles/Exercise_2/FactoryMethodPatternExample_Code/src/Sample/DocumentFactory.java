package Sample;

//Abstract DocumentFactory class that defines the factory method pattern
public abstract class DocumentFactory {
    
    public abstract Document createDocument();

    public void processDocument() {
        Document document = createDocument();
        System.out.println("Created: " + document.getDocumentType());
        document.open();
        document.save();
        document.close();
        System.out.println("----------------------------------------");
    }
}