package mediator;

import java.awt.*;
import java.awt.event.*;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
  private Mediator mediator;

  public ColleagueTextField(String text, int columns) throws HeadlessException {
    super(text, columns);
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

  @Override
  public synchronized void addTextListener(TextListener l) {
    super.addTextListener(l);
  }

  @Override
  public void textValueChanged(TextEvent e) {
    mediator.colleagueChanged(this);
  }
}
