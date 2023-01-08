package command;

public class StereoOffCommand implements Command {

  private Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    if (stereo.getState() == StereoState.OFF)
      return;

    stereo.setState(StereoState.OFF);
    System.out.println(stereo.getLocation() + " Stereo turned off");
  }
}
