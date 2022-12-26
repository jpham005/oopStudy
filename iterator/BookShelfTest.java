package iterator;

import javax.print.event.PrintJobListener;

public class BookShelfTest {
  public static void main(String args[]) {
    BookShelf bookShelf = new BookShelf(4);

    bookShelf.appendBook(new Book("Around the World in 80 Days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));

    {
      Iterator it = bookShelf.iterator();
      while (it.hasNext()) {
        Book book = (Book)it.next();
        System.out.println("" + book.getName());
      }
    }

    System.out.println("\n한줄 띄워주세용\n");

    {
      Iterator rit = bookShelf.reverseIterator();
      while (rit.hasNext()) {
        Book book = (Book)rit.next();
        System.out.println("" + book.getName());
      }
    }
  }
}
