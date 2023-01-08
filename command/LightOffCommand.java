package command;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    if (light.getState() == LightState.OFF)
      return;

    light.setState(LightState.OFF);
    System.out.println(light.getLocation() + " Light turned off");
  }
}
