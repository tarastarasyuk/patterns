package behavioralPatterns.command.thebestExample;

public class SetTopBoxOnCommand implements Command{

    SetTopBox setTopBox;

    public SetTopBoxOnCommand(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.on();
        setTopBox.setChannel(312);
        setTopBox.setVolume(11);
    }
}
