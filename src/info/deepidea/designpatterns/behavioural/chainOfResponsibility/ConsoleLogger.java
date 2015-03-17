package info.deepidea.designpatterns.behavioural.chainOfResponsibility;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Level level) {
        logLevel = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("CONSOLE LOGGER: " + msg);
    }
}
