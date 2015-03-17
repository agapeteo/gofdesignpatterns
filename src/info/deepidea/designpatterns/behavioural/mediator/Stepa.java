package info.deepidea.designpatterns.behavioural.mediator;

public class Stepa extends Colleague {
    public Stepa(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Stepa received: " + message);
    }
}
