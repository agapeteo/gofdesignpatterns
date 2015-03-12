package info.deepidea.designpatterns.behavioural.chainOfResponsibility;

public class SmsLogger extends Logger {

    public SmsLogger(Level level) {
        logLevel = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("SMS LOGGER: " + msg);
    }
}
