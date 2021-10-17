package behavioralPatterns.command.javarushExample;

//Invoker
public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;
    private Command allCycle;

    public Switch(Command flipUpCommand, Command flipDownCommand, Command allCycle) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
        this.allCycle = allCycle;
    }

    public void allCycle() {
        allCycle.execute();
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }
}
