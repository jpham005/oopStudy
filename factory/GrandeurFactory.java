package factory;

public class GrandeurFactory extends CarFactory {
  @Override
  public Car produceCar() {
    return new Grandeur();
  }
}
