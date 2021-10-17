package behavioralPatterns.command.labwork7;


public class ClickOnContactPageCommand extends MenuCommand {
    public ClickOnContactPageCommand(Menu menu) {
        super(menu);
    }

    @Override
    public void execute() {
        super.menu.clickOnContactPage();
    }
}
