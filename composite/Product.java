package composite;

public class Product extends ProductCategory {

  public Product(int id, String name, int price) {
    super(id, name, price);
  }

  @Override
  public void addProduct(ProductCategory product) {
    super.composite.add(product);
  }

  @Override
  public void removeProduct(ProductCategory product) {
    super.composite.remove(product);
  }

  @Override
  public int getCount() {
    int ret = 1;

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
    int ret = price;

    for (ProductCategory product : composite) {
      ret += product.price;
    }

    return ret;
  }

  @Override
  public int getId() {
    return id;
  }
  
}
