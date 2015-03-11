package info.deepidea.designpatterns.behavioural.templateMethod;

public class XlsxReader extends ExcelConverter{
    @Override
    void readDocument() {
        System.out.println("Reading XLSX document...");
    }
}
