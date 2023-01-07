package command;

public class Light {
  private String location;
  private boolean state;

  public Light(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }
}
