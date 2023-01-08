package command;

import java.util.Map;
import java.util.HashMap;

public class RemoteControl {

  private Map<Integer, CommandEntry> controls = new HashMap<>();

  public void setCommand(int n, Command on, Command off) {
    controls.put(n, new CommandEntry(on, off));
  }

  public void onButtonWasPushed(int n) {
    CommandEntry commandEntry = controls.get(n);

    if (commandEntry != null) {
      commandEntry.on.execute();
    }
  }

  public void offButtonWasPushed(int n) {
    CommandEntry commandEntry = controls.get(n);

    if (commandEntry != null) {
      commandEntry.off.execute();
    }
  }

  @Override
  public String toString() {
    return "Start Remote Control";
  }
}

class CommandEntry {
  public Command on;
  public Command off;

  public CommandEntry(Command on, Command off) {
    this.on = on;
    this.off = off;
  }
}
