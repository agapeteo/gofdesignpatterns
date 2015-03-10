package info.deepidea.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeOfLeaves implements Greens {
    private List<Greens> leaves = new ArrayList<Greens>();

    @Override
    public void print() {
        for (Greens each : leaves) {
            each.print();
        }
    }

    public void add(Greens greens) {
        leaves.add(greens);
    }

    public void remove(Greens greens) {
        leaves.remove(greens);
    }
}
