package test;

import abstractfactory.UserInfoClient;
import composite.CategoryClient;

public class DayFour implements DailyTest {
  @Override
  public void test(String[] args) {
    // try {
    //   UserInfoClient.main(args);
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // } finally {
    //   System.out.println("UserInfoClient done");
    // }

    CategoryClient.main(args);
  }
}
