package info.deepidea.designpatterns.behavioural.visitor;

public class Lvov implements Place {
    @Override
    public void accept(Traveler traveler) {
        traveler.visit(this);
    }
}
