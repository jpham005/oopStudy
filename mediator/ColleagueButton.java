package mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {

  public ColleagueButton(String caption) {
    super(caption);
  }

  public void setMediator(Mediator mediator) {}

  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }
}
