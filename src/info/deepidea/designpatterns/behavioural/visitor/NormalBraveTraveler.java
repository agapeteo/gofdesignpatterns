package info.deepidea.designpatterns.behavioural.visitor;

public class NormalBraveTraveler implements Traveler {
    @Override
    public void visit(Ukraine ukraine) {
        System.out.println("I'm traveling through Ukraine.");
    }

    @Override
    public void visit(Kiev kiev) {
        System.out.println("Kiev is a beautiful city.");
    }

    @Override
    public void visit(Lvov lvov) {
        System.out.println("Lvov is a beautiful city.");
    }

    @Override
    public void visit(Donetsk donetsk) {
        System.out.println("Donetsk has been seized by pro-Russian separatists.");
    }
}
