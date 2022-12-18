package factory;

public class SonataFactory extends CarFactory {
  @Override
  public Car produceCar() {
    return new Sonata();
  }
}
