package behavioralPatterns.command.labwork7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeveralActions implements Command{
    List<Command> commands = new ArrayList<>();

    public SeveralActions(Command ... commands) {
        this.commands.addAll(Arrays.asList(commands));
    }

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
