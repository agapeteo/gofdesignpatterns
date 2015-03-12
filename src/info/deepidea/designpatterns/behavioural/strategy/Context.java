package info.deepidea.designpatterns.behavioural.strategy;

public class Context {
    private final Converter converter;

    public Context(Converter converter) {
        this.converter = converter;
    }

    public void convertText(String text) {
        converter.convert(text);
    }
}
