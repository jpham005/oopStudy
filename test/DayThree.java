package test;

import bridge.BridgeTest;
import observer.ObserverTest;
import template.CarTest;

public class DayThree implements DailyTest {
  @Override
  public void test(String[] args) {
    // (new CarTest()).main(args);

    // (new ObserverTest()).main(args);

    (new BridgeTest()).main(args);
  }
}
