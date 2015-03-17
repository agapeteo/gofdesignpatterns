package info.deepidea.designpatterns.behavioural.templateMethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        ExcelConverter xlsConverter = new XlsReader();
        ExcelConverter xlsxConverter = new XlsxReader();

        xlsConverter.convertExcelDocument();
        System.out.println("------------");
        xlsxConverter.convertExcelDocument();
    }
}
