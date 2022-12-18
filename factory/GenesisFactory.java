package factory;

public class GenesisFactory extends CarFactory {
  @Override
  public Car produceCar() {
    return new Genesis();
  }
}
