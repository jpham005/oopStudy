package state_;

public class Player { 
 PlayerLevel level;

 public Player() { 
  level = new BeginerLevel();
 }

 public PlayerLevel getLevel() {
   return level;
  }
  
  public void upgradeLevel(PlayerLevel level) {
    this.level = level;
  }

  public void play(int time) { 
   level.run();
   for(int i = 0; i < time; i++) { 
    level.jump();
   } 
   level.turn();
  }
}
