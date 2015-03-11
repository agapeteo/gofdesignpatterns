package info.deepidea.designpatterns.behavioural.templateMethod;

public abstract class ExcelConverter {
    abstract void readDocument();

    void getPlainTextFromDocument() {
        System.out.println("Document has been converted to plain text.");
    }

    void convertExcelDocument() {
        readDocument();
        getPlainTextFromDocument();
    }
}
