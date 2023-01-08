package command;

public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    if (light.getState() == LightState.ON)
      return;

    light.setState(LightState.ON);
    System.out.println(light.getLocation() + " Light turned on");
  }
}
