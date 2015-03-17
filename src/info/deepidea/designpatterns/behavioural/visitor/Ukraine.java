package info.deepidea.designpatterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Ukraine implements Place {
    private List<Place> cities = new ArrayList<Place>();

    public Ukraine() {
        cities.add(new Kiev());
        cities.add(new Lvov());
        cities.add(new Donetsk());
    }

    @Override
    public void accept(Traveler traveler) {
        traveler.visit(this);

        for (Place each : cities) {
            each.accept(traveler);
        }
    }
}
