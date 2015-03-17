package info.deepidea.designpatterns.behavioural.chainOfResponsibility;

public abstract class Logger {
    protected Level logLevel;
    private Logger nextLogger;

    public void setNextLogger(Logger logger) {
        nextLogger = logger;
    }

    public void logMessage(Level logLevel, String msg) {
        if (this.logLevel.getCode() <= logLevel.getCode()) {
            write(msg);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, msg);
        }
    }

    protected abstract void write(String msg);
}
