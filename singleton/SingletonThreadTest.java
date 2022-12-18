package singleton;

class SingletonContainer implements Runnable {
  private Singleton _instance;

  public Singleton getInstance() {
    return _instance;
  }

  @Override
  public void run() {
    System.out.println("thread start running");
    _instance = Singleton.getInstance();
  }
}

public class SingletonThreadTest {
  private final static int _testCnt = 10;

  public static void main(String[] args) {
    SingletonContainer[] containers = new SingletonContainer[_testCnt];
    Thread[] threads = new Thread[_testCnt];

    for (int i = 0; i < _testCnt; i++) {
      containers[i] = new SingletonContainer();
    }

    for (int i = 0; i < _testCnt; i++) {
      threads[i] = new Thread(containers[i]);
    }

    for (int i = 0; i < _testCnt; i++) {
      threads[i].start();
    }

    for (int i = 0; i < _testCnt; i++) {
      try {
        threads[i].join();
      } catch (Exception e) {
        System.out.printf("Exception caught: %s\n", e.getMessage());
        return;
      }
    }

    for (int i = 0; i < _testCnt - 1; i++) {
      if (containers[i].getInstance() != containers[i + 1].getInstance()) {
        System.out.println("false");
        return;
      }
    }

    System.out.println("true");
  }
}
