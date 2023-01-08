package command;

enum StereoState {
  OnWithCd,
  OFF
}

public class Stereo {
  private String location;
  private StereoState state = StereoState.OFF;

  public Stereo(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public StereoState getState() {
    return state;
  }

  public void setState(StereoState state) {
    this.state = state;
  }
}
