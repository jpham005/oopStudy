package iterator;

public class BookShelfIteratorFactory extends Factory {
  final static int ITER = 1;
  final static int REVERSE_ITER = 2;

  @Override
  protected Iterator createProduct(Aggregate list, int type) {
    switch (type) {
      case ITER:
        return list.iterator();
      case REVERSE_ITER:
        return list.reverseIterator();
      default:
        throw new Error("wrong type");
    }
  }
}
