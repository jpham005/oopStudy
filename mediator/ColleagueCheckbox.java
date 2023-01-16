package mediator;

import java.awt.*;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {

  private Mediator mediator;

  public ColleagueCheckbox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
    super(label, group, state);
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
  public synchronized void addItemListener(ItemListener l) {
    super.addItemListener(l);
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    mediator.colleagueChanged(this);
  }

}
