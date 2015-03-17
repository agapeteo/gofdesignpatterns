package info.deepidea.designpatterns.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        BicycleTire steelCordedTire = new BicycleTire(26, new SteelCordedTire());
        BicycleTire kevlarCordedTire = new BicycleTire(28, new KevlarCordedTire());

        steelCordedTire.create();
        kevlarCordedTire.create();
    }
}
