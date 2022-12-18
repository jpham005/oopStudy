package singleton;

public class Singleton {
  private Singleton() {
    System.out.println("instance created");
  }

  public static Singleton getInstance() {
    return LazyHolder.INSTANCE;
    // return new Singleton();
  }

  private static class LazyHolder {
    private static final Singleton INSTANCE = new Singleton();
  }
}
