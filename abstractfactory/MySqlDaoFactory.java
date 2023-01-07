package abstractfactory;

public class MySqlDaoFactory extends DaoFactory {
  @Override
  public UserInfoDao createUserInfoDao() {
    return new MySqlUserInfoDao();
  }

  @Override
  public ProductDao createProductDao() {
    return new MySqlProductDao();
  }
}
