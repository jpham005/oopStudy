package command;

public class CeilingFanOffCommand implements Command {

  private CeilingFan ceiling;

  public CeilingFanOffCommand(CeilingFan ceiling) {
    this.ceiling = ceiling;
  }

  @Override
  public void execute() {
    if (ceiling.getState() == CeilingFanState.OFF)
      return;

    ceiling.setState(CeilingFanState.OFF);
    System.out.println(ceiling.getLocation() + " CeilingFan turned off");
  }
}
