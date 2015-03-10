package info.deepidea.designpatterns.behavioural.visitor;

public class SillyBraveTraveler implements Traveler {
    @Override
    public void visit(Ukraine ukraine) {
        System.out.println("I'm traveling through Ukraine.");
    }

    @Override
    public void visit(Kiev kiev) {
        System.out.println("Kiev should be freed from the junta!");
    }

    @Override
    public void visit(Lvov lvov) {
        System.out.println("Lvov should be destroyed by DPR forces!");
    }

    @Override
    public void visit(Donetsk donetsk) {
        System.out.println("Donetsk has been freed by united forces of miners and tractor drivers.\n" +
                "The glory of the DPR!");
    }
}
