package behavioralPatterns.command.labwork7;


public abstract class MenuCommand implements Command {
    protected Menu menu;

    public MenuCommand(Menu menu) {
        this.menu = menu;
    }
}
