package command;

enum LightState {
  ON,
  OFF
}

public class Light {

  private String location;
  private LightState state = LightState.OFF;

  public Light(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public LightState getState() {
    return state;
  }

  public void setState(LightState state) {
    this.state = state;
  }
}
