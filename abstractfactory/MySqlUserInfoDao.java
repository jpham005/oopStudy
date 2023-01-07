package abstractfactory;

public class MySqlUserInfoDao extends UserInfoDao {
  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.printf(
      "inserting MySql user %s\n", userInfo.getUserName()
    );
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.printf(
      "updating MySql user %s\n", userInfo.getUserName()
    );
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.printf(
      "deleting MySql user %s\n", userInfo.getUserName()
    );
  }
}
