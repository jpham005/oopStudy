package test;

import state_.*;
import strategy.*;
import strategy2.strategy2Test;
import iterator.*;


public class DayTwo implements DailyTest {
  @Override
  public void test(String[] args) {
    // (new state_.MainBoard()).main(args);

    // (new strategy.StudentTest()).main(args);

    // (new strategy2Test()).main(args);

    (new iterator.BookShelfTest()).main(args);
  }
}
