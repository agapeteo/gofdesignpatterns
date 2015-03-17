package info.deepidea.designpatterns.behavioural.observer;


public class ObserverTest {
    public static void main(String[] args) {
        KievMeteoService station = new KievMeteoService(12.3f);
        Observer client1 = new Client("Pasha");
        Observer client2 = new Client("Vova");

        station.addObserver(client1);
        station.addObserver(client2);

        station.notifyObservers();
        System.out.println("--------------");
        station.setTemperature(22.7f);
    }
}
