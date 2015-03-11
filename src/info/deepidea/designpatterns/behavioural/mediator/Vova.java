package info.deepidea.designpatterns.behavioural.mediator;

public class Vova extends Colleague {
    public Vova(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Vova received: " + message);
    }
}
