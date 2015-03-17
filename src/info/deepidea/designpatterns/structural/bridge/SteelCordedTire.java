package info.deepidea.designpatterns.structural.bridge;

public class SteelCordedTire implements TireMaker {
    @Override
    public void makeTire(int size) {
        System.out.println("Steel-corded tire with size " + size + " has been created.");
    }
}
