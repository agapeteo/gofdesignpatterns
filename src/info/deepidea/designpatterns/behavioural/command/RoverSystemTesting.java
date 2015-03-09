package info.deepidea.designpatterns.behavioural.command;

public class RoverSystemTesting {
    public static void main(String[] args) {
        CuriosityRover rover = new CuriosityRover();

        Command moveForward = new MoveForwardCommand(rover);
        Command moveBackward = new MoveBackwardCommand(rover);
        Command turnLeft = new TurnLeftCommand(rover);
        Command turnRight = new TurnRightCommand(rover);

        MarsScienceLaboratory msl = new MarsScienceLaboratory();
        msl.addCommand(moveForward);
        msl.addCommand(moveBackward);
        msl.addCommand(turnLeft);
        msl.addCommand(turnRight);

        msl.sendPacketOfCommandsToTheCuriosityRover();
    }
}