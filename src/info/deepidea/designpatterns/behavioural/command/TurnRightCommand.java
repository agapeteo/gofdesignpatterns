package info.deepidea.designpatterns.behavioural.command;

public class TurnRightCommand implements Command {
    private CuriosityRover rover;

    public TurnRightCommand(CuriosityRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
