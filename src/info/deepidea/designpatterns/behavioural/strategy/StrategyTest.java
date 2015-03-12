package info.deepidea.designpatterns.behavioural.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context toDoc = new Context(new WordConverter());
        Context toPdf = new Context(new PdfConverter());

        toDoc.convertText("To doc pls.");
        toPdf.convertText("To pdf pls.");
    }
}
