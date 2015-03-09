package info.deepidea.designpatterns.behavioural.command;

public class TurnLeftCommand implements Command {
    private CuriosityRover rover;

    public TurnLeftCommand(CuriosityRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
