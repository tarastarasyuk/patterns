package behavioralPatterns.command.javarushExample;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command switchUp = new TurnOnLightCommand(light);
        Command switchOff = new TurnOffLightCommand(light);
        Command all = new MakeAllCycleLightCommand(light);

        Switch sw = new Switch(switchUp, switchOff, all);
        sw.flipUp();
        sw.flipDown();
        System.out.println("--");
        sw.allCycle();
    }
}
