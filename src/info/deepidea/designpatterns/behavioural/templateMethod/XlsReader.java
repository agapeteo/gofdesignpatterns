package info.deepidea.designpatterns.behavioural.templateMethod;

public class XlsReader extends ExcelConverter {
    @Override
    void readDocument() {
        System.out.println("Reading XLS document...");
    }
}
