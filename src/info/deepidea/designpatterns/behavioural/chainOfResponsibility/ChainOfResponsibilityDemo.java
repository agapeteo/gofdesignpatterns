package info.deepidea.designpatterns.behavioural.chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    private static Logger getChain() {
        Logger smsLogger = new SmsLogger(Level.CRITICAL);
        Logger fileLogger = new FileLogger(Level.WARNING);
        Logger consoleLogger = new ConsoleLogger(Level.INFO);

        smsLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return smsLogger;
    }

    public static void main(String[] args) {
        Logger chain = getChain();

        chain.logMessage(Level.INFO, "All ok.");
        System.out.println("------------------");
        chain.logMessage(Level.WARNING, "WARNING!!!");
        System.out.println("------------------");
        chain.logMessage(Level.CRITICAL, "CRITICAL!!!");
    }
}
