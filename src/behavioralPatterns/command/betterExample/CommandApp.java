package behavioralPatterns.command.betterExample;

public class CommandApp {
    public static void main(String[] args) {
        Comp c = new Comp();
        User u = new User(
                new StartCommand(c),
                new StopCommand(c),
                new ResetCommand(c)
        );

        u.startComputer();
        u.resetExecute();
        u.stopExecute();
    }
}

abstract class Command {
    Comp computer;

    public Command(Comp computer) {
        this.computer = computer;
    }

    public abstract void execute();
}

class Comp {
    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void reset() {
        System.out.println("Reset");
    }
}

class StartCommand extends Command {

    public StartCommand(Comp computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.start();
    }
}

class StopCommand extends Command {

    public StopCommand(Comp computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.stop();
    }
}

class ResetCommand extends Command {

    public ResetCommand(Comp computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.reset();
    }
}

//invoker
class User {
    private Command start;
    private Command stop;
    private Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComputer() {
        start.execute();
    }

    public void stopExecute() {
        stop.execute();
    }

    public void resetExecute() {
        reset.execute();
    }
}