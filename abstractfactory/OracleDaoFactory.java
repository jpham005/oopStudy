package abstractfactory;

public class OracleDaoFactory extends DaoFactory {
  @Override
  public UserInfoDao createUserInfoDao() {
    return new OracleUserInfoDao();
  }

  @Override
  public ProductDao createProductDao() {
    return new OracleProductDao();
  }
}
