package info.deepidea.designpatterns.behavioural.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Place ukraine = new Ukraine();
        Traveler braveTraveler = new NormalBraveTraveler();
        Traveler sillyTraveler = new SillyBraveTraveler();

        ukraine.accept(braveTraveler);
        System.out.println("------------------");
        ukraine.accept(sillyTraveler);
    }
}
