package state_;

public abstract class PlayerLevel {
  abstract public void run();
  abstract public void jump();
  abstract public void turn();
  abstract public void showLevelMessage(); // return message?
  public void go(int n) {
    for (int i = 0; i < n; i++) { // ????
      System.out.println("GoLang");
    }
  }
}
