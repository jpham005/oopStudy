package iterator;

public class BookShelfReverseIterator implements Iterator {
  BookShelf bookShelf;
  private int index;

  public BookShelfReverseIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    index = bookShelf.getLength();
  }

  @Override
  public boolean hasNext() {
    return index > 0;
  }

  @Override
  public Book next() {
    return bookShelf.getBook(--index);
  }
}
