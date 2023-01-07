package abstractfactory;

public class MySqlProductDao extends ProductDao {
  @Override
  public void insertProduct(Product product) {
    System.out.printf("inserting MySql product %s\n", product.getProductName());
  }

  @Override
  public void updateProduct(Product product) {
    System.out.printf("updating MySql product %s\n", product.getProductName());
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.printf("deleting MySql product %s\n", product.getProductName());
  }
}
