package info.deepidea.designpatterns.behavioural.command;

public class CuriosityRover {
    public void turnLeft() {
        System.out.println("Rover is turning left.");
    }

    public void turnRight() {
        System.out.println("Rover is turning right.");
    }

    public void moveForward() {
        System.out.println("Rover is moving forward.");
    }

    public void moveBackward() {
        System.out.println("Rover is moving backward.");
    }
}
