package abstractfactory;

public class OracleProductDao extends ProductDao {
  @Override
  public void insertProduct(Product product) {
    System.out.printf("inserting Oracle product %s\n", product.getProductName());
  }

  @Override
  public void updateProduct(Product product) {
    System.out.printf("updating Oracle product %s\n", product.getProductName());
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.printf("deleting Oracle product %s\n", product.getProductName());
  }
}
