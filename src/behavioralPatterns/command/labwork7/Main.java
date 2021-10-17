package behavioralPatterns.command.labwork7;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Panel panel = new Panel();
        MenuCommand toPortfolio = new ClickOnPortfolioPageCommand(menu);
        MenuCommand toContact = new ClickOnContactPageCommand(menu);
        MenuCommand toAbout = new ClickOnAboutPageCommand(menu);
        PanelCommand toSettings = new ClickOnSettingsCommand(panel);
        PanelCommand toNewTab = new ClickOnNewTabCommand(panel);
        SeveralActions severalActions = new SeveralActions(toAbout, toPortfolio, toAbout, toNewTab, toContact, toSettings);

        ClientInvoker clientInvoker = new ClientInvoker(toPortfolio);
        clientInvoker.pressOnElement();

        clientInvoker.setCommand(toNewTab);
        clientInvoker.pressOnElement();

        clientInvoker.setCommand(toContact);
        clientInvoker.pressOnElement();

        clientInvoker.setCommand(severalActions);
        clientInvoker.pressOnElement();

    }
}
