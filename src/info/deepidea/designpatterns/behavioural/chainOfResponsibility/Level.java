package info.deepidea.designpatterns.behavioural.chainOfResponsibility;

public enum Level {
    INFO(1),
    WARNING(2),
    CRITICAL(3);

    private int code;

    private Level(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
