package behavioralPatterns.command.labwork7;


public class ClickOnPortfolioPageCommand extends MenuCommand {
    public ClickOnPortfolioPageCommand(Menu menu) {
        super(menu);
    }

    @Override
    public void execute() {
        super.menu.clickOnPortfolioPage();
    }
}
