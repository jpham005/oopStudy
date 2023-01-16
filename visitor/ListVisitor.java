package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

  @Override
  public void visit(File file) {
    System.out.println(file);
  }

  @Override
  public void visit(Directory directory) {
    System.out.println(directory.getName() + "/ " + " (" + directory.getSize() + ")");

    Iterator<Entry> iter = directory.iterator();
    
    while (iter.hasNext()) {
      Entry curr = iter.next();

      curr.accept(this);
    }
  }

}
