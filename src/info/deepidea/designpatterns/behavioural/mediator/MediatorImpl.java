package info.deepidea.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    private final List<Colleague> colleagues;

    public MediatorImpl() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague sender) {
        for (Colleague eachColleague : colleagues) {
            if (eachColleague != sender) {
                eachColleague.receive(message);
            }
        }
    }
}
