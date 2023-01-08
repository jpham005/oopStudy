package command;

public class CeilingFanOnCommand implements Command {

  private CeilingFan ceiling;

  public CeilingFanOnCommand(CeilingFan ceiling) {
    this.ceiling = ceiling;
  }

  @Override
  public void execute() {
    if (ceiling.getState() == CeilingFanState.ON)
      return;

    ceiling.setState(CeilingFanState.ON);
    System.out.println(ceiling.getLocation() + " CeilingFan turned on");
  }
}
