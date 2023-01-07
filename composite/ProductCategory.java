package composite;

import java.util.ArrayList;

public abstract class ProductCategory {
  protected ArrayList<ProductCategory> composite;

  int id;
  String name;
  int price;

  public ProductCategory(int id, String name, int price) {
    composite = new ArrayList<ProductCategory>();
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public abstract void addProduct(ProductCategory product);
  public abstract void removeProduct(ProductCategory product);
  public abstract int getCount();
  public abstract String getName();
  public abstract int getPrice();
  public abstract int getId();
}
