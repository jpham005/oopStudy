package visitor;

public class File extends Entry {

  private int size;

  public File(String name, int size) {
    super(name);
    this.size = size;
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
    return size;
  }

}
