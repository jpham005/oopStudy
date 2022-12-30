package observer;

public class GraphObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    int number = generator.getNumber();

    for (int i = 0; i < number; i++) {
      System.out.print('*');
    }

    System.out.println();
  }
}
