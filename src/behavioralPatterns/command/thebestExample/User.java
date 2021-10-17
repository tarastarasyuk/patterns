package behavioralPatterns.command.thebestExample;

public class User {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();

        remoteControl.setCommand(new SetTopBoxOffCommand(setTopBox));

        remoteControl.pressButton();
    }
}
