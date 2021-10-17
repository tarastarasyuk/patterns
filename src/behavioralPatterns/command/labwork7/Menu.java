package behavioralPatterns.command.labwork7;

public class Menu implements AppSectionInterface {

    public void clickOnAboutPage() {
        System.out.println("Menu: Redirecting to About Page...");
    }

    public void clickOnPortfolioPage() {
        System.out.println("Menu: Redirecting to Portfolio Page...");
    }

    public void clickOnContactPage() {
        System.out.println("Menu: Redirecting to Contact Page...");
    }

}
