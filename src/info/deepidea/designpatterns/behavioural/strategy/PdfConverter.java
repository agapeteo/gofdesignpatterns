package info.deepidea.designpatterns.behavioural.strategy;

public class PdfConverter implements Converter {
    @Override
    public void convert(String text) {
        System.out.println("[" + text + "] converted to pdf file.");
    }
}
