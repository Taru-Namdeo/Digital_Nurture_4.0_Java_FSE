## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Factory Method Pattern Example

This project demonstrates the implementation of the Factory Method Pattern for a document management system.

## Project Structure

```
src/Sample/
├── Document.java                    # Interface for all document types
├── WordDocument.java               # Concrete Word document implementation
├── PdfDocument.java                # Concrete PDF document implementation
├── ExcelDocument.java              # Concrete Excel document implementation
├── DocumentFactory.java            # Abstract factory class
├── WordDocumentFactory.java        # Concrete factory for Word documents
├── PdfDocumentFactory.java         # Concrete factory for PDF documents
├── ExcelDocumentFactory.java       # Concrete factory for Excel documents
└── DocumentManagementSystem.java   # Main test class
```

## Design Pattern Overview

The Factory Method Pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to decide which class to instantiate. This pattern is used when:

- A class cannot anticipate the class of objects it must create
- A class wants its subclasses to specify the objects it creates
- Classes delegate responsibility to one of several helper subclasses

## Implementation Details

### 1. Document Interface
- Defines the contract for all document types
- Includes methods: `open()`, `save()`, `close()`, and `getDocumentType()`

### 2. Concrete Document Classes
- **WordDocument**: Implements document operations for Word files
- **PdfDocument**: Implements document operations for PDF files
- **ExcelDocument**: Implements document operations for Excel files

### 3. Abstract Factory Class
- **DocumentFactory**: Contains the abstract `createDocument()` method
- Includes a template method `processDocument()` that demonstrates document lifecycle

### 4. Concrete Factory Classes
- **WordDocumentFactory**: Creates Word document instances
- **PdfDocumentFactory**: Creates PDF document instances
- **ExcelDocumentFactory**: Creates Excel document instances

## Benefits of This Implementation

1. **Encapsulation**: Document creation logic is encapsulated in factory classes
2. **Extensibility**: Easy to add new document types without modifying existing code
3. **Polymorphism**: All documents can be treated uniformly through the Document interface
4. **Single Responsibility**: Each factory is responsible for creating one type of document
5. **Open/Closed Principle**: Open for extension (new document types) but closed for modification

## How to Run

1. Compile the project:
   ```bash
   javac -d bin src/Sample/*.java
   ```

2. Run the main class:
   ```bash
   java -cp bin Sample.DocumentManagementSystem
   ```

## Output

The program demonstrates:
- Creating different document types using factory methods
- Processing documents through their lifecycle (open, save, close)
- Direct document creation and type checking
- Benefits of the Factory Method Pattern

## Extending the Pattern

To add a new document type (e.g., PowerPoint):

1. Create a new concrete document class implementing `Document`
2. Create a new concrete factory class extending `DocumentFactory`
3. No changes needed to existing code - the pattern supports easy extension
