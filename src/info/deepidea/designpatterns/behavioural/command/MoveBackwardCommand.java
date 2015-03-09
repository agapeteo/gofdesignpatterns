package info.deepidea.designpatterns.behavioural.command;

public class MoveBackwardCommand implements Command {
    private CuriosityRover rover;

    public MoveBackwardCommand(CuriosityRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveBackward();
    }
}
