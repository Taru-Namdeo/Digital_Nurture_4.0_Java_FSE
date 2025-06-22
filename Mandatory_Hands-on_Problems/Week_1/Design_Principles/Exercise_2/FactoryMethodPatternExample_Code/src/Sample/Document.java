package Sample;

//Document interface that defines the contract for all document types
public interface Document {

    void open();

    void save();
 
    void close();

    String getDocumentType();
} 