//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Cliente
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Encender la luz
        remote.setCommand(turnOn);
        remote.pressButton();

        // Apagar la luz
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}