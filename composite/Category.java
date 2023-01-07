package composite;

public class Category extends ProductCategory {
  public Category(int id, String name, int price) {
    super(id, name, price);
  }

  @Override
  public void addProduct(ProductCategory product) {
    composite.add(product);
  }

  @Override
  public void removeProduct(ProductCategory product) {
    composite.remove(product);
  }

  @Override
  public int getCount() {
    int ret = 0;

    for (ProductCategory product : composite) {
      ret += product.getCount();
    }

    return ret;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getPrice() {
    int ret = 0;

    for (ProductCategory product : composite) {
      ret += product.getPrice();
    }

    return ret;
  }

  @Override
  public int getId() {
    return id;
  }
}
