package iterator;

public class BookShelfIterator implements Iterator {
  BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < bookShelf.getLength();
  }

  @Override
  public Book next() {
    return bookShelf.getBook(index++);
  }
}
