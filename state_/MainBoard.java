package state_;

public class MainBoard {
  private static void upgradeLevelDebug(Player player, PlayerLevel level) {
    PlayerLevel before, after;

    before = player.getLevel();
    player.upgradeLevel(level);
    after = player.getLevel();

    System.out.print("Before: ");
    before.showLevelMessage();

    System.out.print("After: ");
    after.showLevelMessage();
  }

  public static void main(String[] args) {
    Player player = new Player();

    player.play(1);
    upgradeLevelDebug(player, new AdvancedLevel());
    player.play(2);
    upgradeLevelDebug(player, new SuperLevel());
    player.play(3);
   }
}
