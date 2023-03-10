package command;

enum GarageDoorState {
  UP,
  DOWN
}

public class GarageDoor {
  private String location;
  private GarageDoorState state = GarageDoorState.DOWN;
  
  public GarageDoor(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GarageDoorState getState() {
    return state;
  }

  public void setState(GarageDoorState state) {
    this.state = state;
  }
}
