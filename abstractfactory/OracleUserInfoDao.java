package abstractfactory;

public class OracleUserInfoDao extends UserInfoDao {
  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.printf(
      "inserting Oracle user %s\n", userInfo.getUserName()
    );
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.printf(
      "updating Oracle user %s\n", userInfo.getUserName()
    );
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.printf(
      "deleting Oracle user %s\n", userInfo.getUserName()
    );
  }
}
