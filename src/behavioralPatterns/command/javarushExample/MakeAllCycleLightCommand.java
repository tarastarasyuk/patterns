package behavioralPatterns.command.javarushExample;

public class MakeAllCycleLightCommand implements Command{
    private Light light;

    public MakeAllCycleLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.turnOff();
    }
}
