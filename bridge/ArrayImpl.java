package bridge;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {
  private ArrayList<T> arrayList;

  public ArrayImpl() {
    arrayList = new ArrayList<T>();
  }

  @Override
  public void addElement(T obj) {
    arrayList.add(obj);
  }

  @Override
  public T deleteElement(int i) {
    return arrayList.remove(i);
  }

  @Override
  public int insertElement(T obj, int i) {
    arrayList.add(i, obj);
    return i;
  }

  @Override
  public T getElement(int i) {
    return arrayList.get(i);
  }

  @Override
  public int getElementSize() {
    return arrayList.size();
  }
  
}
