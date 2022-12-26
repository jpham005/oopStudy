package iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
  private ArrayList<Book> bookArrayList;

  public BookShelf(int cap) {
    this.bookArrayList = new ArrayList<Book>(cap);
  }

  @Override
  public int getLength() {
    return bookArrayList.size();
  }

  Book getBook(int index) {
    return bookArrayList.get(index);
  }

  public void appendBook(Book book) {
    bookArrayList.add(book);
  }

  @Override
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }

  @Override
  public Iterator reverseIterator() {
    return new BookShelfReverseIterator(this);
  }
}
