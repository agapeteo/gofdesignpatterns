package info.deepidea.designpatterns.behavioural.mediator;

public interface Mediator {
    void send(String message, Colleague sender);
}
