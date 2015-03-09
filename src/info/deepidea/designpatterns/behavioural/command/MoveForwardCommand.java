package info.deepidea.designpatterns.behavioural.command;

public class MoveForwardCommand implements Command {
    private CuriosityRover rover;

    public MoveForwardCommand(CuriosityRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveForward();
    }
}
