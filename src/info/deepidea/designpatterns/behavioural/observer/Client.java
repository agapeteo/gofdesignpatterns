package info.deepidea.designpatterns.behavioural.observer;

public class Client implements Observer {
    private final String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Dear " + clientName + ", current temperature in your city is: " + temperature);
    }
}
