package info.deepidea.designpatterns.behavioural.mediator;

public class Pasha extends Colleague {
    public Pasha(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Pasha received: " + message);
    }
}
