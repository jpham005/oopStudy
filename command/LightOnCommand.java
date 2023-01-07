package command;

public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.setState(true);
    System.out.println(" * light " + light.getLocation() + " turned on.");
  }
}
