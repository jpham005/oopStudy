package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

  private ArrayList<Entry> entryList = new ArrayList<Entry>();

  public Directory(String string) {
    super(string);
  }

  @Override
  public Entry add(Entry entry) throws FileTreatmentException {
    entryList.add(entry);
    return entry;
  }

  @Override
  public Iterator<Entry> iterator() throws FileTreatmentException {
    return entryList.iterator();
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int ret = 0;

    for (Entry entry : entryList) {
      ret += entry.getSize();
    }

    return ret;
  }

}
