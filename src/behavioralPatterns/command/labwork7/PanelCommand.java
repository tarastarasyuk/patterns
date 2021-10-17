package behavioralPatterns.command.labwork7;


public abstract class PanelCommand implements Command {
    protected Panel panel;

    public PanelCommand(Panel panel) {
        this.panel = panel;
    }

}
