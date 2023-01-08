package command;

public class StereoOnWithCDCommand implements Command {

  private Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    if (stereo.getState() == StereoState.OnWithCd)
      return;

    stereo.setState(StereoState.OnWithCd);
    System.out.println(stereo.getLocation() + " Stereo turned on with cd");
  }
}
