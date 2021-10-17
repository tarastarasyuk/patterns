package behavioralPatterns.command.labwork7;

public class Panel implements AppSectionInterface {
    public void clickOnNewTab() {
        System.out.println("Panel: Creating a New Tab...");
    }

    public void clickOnSettings() {
        System.out.println("Panel: Opening browser Settings...");
    }
}
