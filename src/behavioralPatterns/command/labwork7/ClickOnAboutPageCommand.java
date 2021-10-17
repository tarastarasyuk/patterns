package behavioralPatterns.command.labwork7;


public class ClickOnAboutPageCommand extends MenuCommand {
    public ClickOnAboutPageCommand(Menu menu) {
        super(menu);
    }

    @Override
    public void execute() {
        super.menu.clickOnAboutPage();
    }
}
