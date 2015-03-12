package info.deepidea.designpatterns.behavioural.strategy;

public class WordConverter implements Converter {
    @Override
    public void convert(String text) {
        System.out.println("[" + text + "] converted to doc file.");
    }
}
