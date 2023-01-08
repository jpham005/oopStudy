package command;

public class GarageDoorUpCommand implements Command {

  private GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    if (garageDoor.getState() == GarageDoorState.UP)
      return;

    garageDoor.setState(GarageDoorState.UP);
    System.out.println(garageDoor.getLocation() + " GarageDoor moved up");
  }
}
