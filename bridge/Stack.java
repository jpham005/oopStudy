package bridge;

public class Stack<T> extends List<T> {

  public Stack(AbstractList<T> list) {
    super(list);
    System.out.printf("%s type으로 Stack를 구현합니다.\n", list.getClass().getName());
  }

  public void push(T obj) {
    impl.addElement(obj);
  }

  public T pop() {
    return impl.deleteElement(impl.getElementSize() - 1);
  }
}
