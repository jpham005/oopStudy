import singleton.*;
import decorator.*;

public class Main {
  public static void main(String[] args) {
    singleton.SingletonTest.main(args);
    singleton.SingletonThreadTest.main(args);

    new decorator.Mochasyrup(new decorator.Bean("Kenya americano")).assemble();
    System.out.println();
    new decorator.Whippedcream(new decorator.Mochasyrup(new decorator.Bean("Etiopia americano"))).assemble();
    System.out.println();
    new decorator.Whippedcream(new decorator.Mochasyrup(new decorator.Mochasyrup(new decorator.Bean("Kenya americano")))).assemble();
    System.out.println();
  }
}
