package info.deepidea.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class MarsScienceLaboratory {
    private List<Command> packetOfCommands = new ArrayList<Command>();

    public void addCommand(Command command) {
        packetOfCommands.add(command);
    }

    public void sendPacketOfCommandsToTheCuriosityRover() {
        for (Command each : packetOfCommands) {
            each.execute();
        }

        packetOfCommands.clear();
    }
}
