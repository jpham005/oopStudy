package command;

enum CeilingFanState {
  ON,
  OFF
}

public class CeilingFan {
  private String location;
  private CeilingFanState state = CeilingFanState.OFF;

  public CeilingFan(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CeilingFanState getState() {
    return state;
  }

  public void setState(CeilingFanState state) {
    this.state = state;
  }
}
