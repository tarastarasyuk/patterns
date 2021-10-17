package behavioralPatterns.command.labwork7;

public class ClientInvoker {
    private Command command;

    public ClientInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressOnElement() {
        command.execute();
    }
}
