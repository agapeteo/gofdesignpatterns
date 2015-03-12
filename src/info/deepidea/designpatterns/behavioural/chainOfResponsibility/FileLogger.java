package info.deepidea.designpatterns.behavioural.chainOfResponsibility;

public class FileLogger extends Logger {

    public FileLogger(Level level) {
        logLevel = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("FILE LOGGER: " + msg);
    }
}
