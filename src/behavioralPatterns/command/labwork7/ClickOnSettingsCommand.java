package behavioralPatterns.command.labwork7;


public class ClickOnSettingsCommand extends PanelCommand {
    public ClickOnSettingsCommand(Panel panel) {
        super(panel);
    }

    @Override
    public void execute() {
        super.panel.clickOnSettings();
    }
}
