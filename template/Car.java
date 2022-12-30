package template;

public abstract class Car {
  public final void startCar() {
    System.out.println("시동을 켭니다");
  }

  // abstract method
  public abstract void drive();
  public abstract void stop();

  // hook method
  public void turnOff() {
    System.out.println("시동을 끕니다");
  }

  // template method
  public final void run() {
    startCar();
    drive();
    stop();
    turnOff();
  }
}
