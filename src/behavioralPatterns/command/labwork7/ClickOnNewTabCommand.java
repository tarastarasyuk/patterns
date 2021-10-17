package behavioralPatterns.command.labwork7;

public class ClickOnNewTabCommand extends PanelCommand {
    public ClickOnNewTabCommand(Panel panel) {
        super(panel);
    }

    @Override
    public void execute() {
        super.panel.clickOnNewTab();
    }
}
