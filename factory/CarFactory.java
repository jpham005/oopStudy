package factory;

public abstract class CarFactory {
  abstract public Car produceCar();
  
  public void testCar() {
    Car _car;

    _car = produceCar();
    System.out.println(_car);
  }
}
