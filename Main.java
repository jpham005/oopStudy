import singleton.*;
import decorator.*;
import factory.*;

public class Main {
  public static void main(String[] args) {
    singleton.SingletonTest.main(args);
    singleton.SingletonThreadTest.main(args);

    System.out.println("====================================");
    
    new decorator.Mochasyrup(new decorator.Bean("Kenya americano")).assemble();
    System.out.println();
    new decorator.Whippedcream(new decorator.Mochasyrup(new decorator.Bean("Etiopia americano"))).assemble();
    System.out.println();
    new decorator.Whippedcream(new decorator.Mochasyrup(new decorator.Mochasyrup(new decorator.Bean("Kenya americano")))).assemble();
    System.out.println();

    System.out.println("====================================");

    CarFactory f = new SonataFactory();
    f.testCar();
    f = new GenesisFactory();
    f.testCar();
    f = new GrandeurFactory();
    f.testCar();
  }
}
