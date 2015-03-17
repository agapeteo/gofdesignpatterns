package info.deepidea.designpatterns.structural.bridge;

public class KevlarCordedTire implements TireMaker {
    @Override
    public void makeTire(int size) {
        System.out.println("Kevlar-corded tire with size " + size + " has been created.");
    }
}
