package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
  private Random random = new Random();   
  private int number;                     

  public int getNumber() {                
      return number;
  }

  public void execute() {
    this.number = random.nextInt(20);
    System.out.printf("random number generated: %d\n", this.number);
  }
}

