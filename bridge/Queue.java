package bridge;

public class Queue<T> extends List<T> {
  public Queue(AbstractList<T> list) {
    super(list);
    System.out.printf("%s type으로 Queue를 구현합니다.\n", list.getClass().getName());
  }

  public void enQueue(T obj) {
    impl.addElement(obj);
  }

  public T deQueue() {
    return impl.deleteElement(0);
  }
}
