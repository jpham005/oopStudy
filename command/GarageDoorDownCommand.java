package command;

public class GarageDoorDownCommand implements Command {

  private GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    if (garageDoor.getState() == GarageDoorState.DOWN)
      return;

    garageDoor.setState(GarageDoorState.DOWN);
    System.out.println(garageDoor.getLocation() + " GarageDoor moved down");
  }
}
