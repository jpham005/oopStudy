package command;

import java.util.Map;
import java.util.HashMap;

public class RemoteControl {

  private Map<String, CommandEntry> controls = new HashMap<>();

  public void onButtonWasPushed(int n) {
    CommandEntry commandEntry = controls.get(Integer.toString(n));

    if (commandEntry != null) {
      commandEntry.on.execute();
    }
  }

  public void offButtonWasPushed(int n) {
    CommandEntry commandEntry = controls.get(Integer.toString(n));

    if (commandEntry != null) {
      commandEntry.off.execute();
    }
  }
}

class CommandEntry {
  public Command on;
  public Command off;
}
