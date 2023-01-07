package abstractfactory;

public abstract class UserInfoDao {
  abstract public void insertUserInfo(UserInfo userInfo);
  abstract public void updateUserInfo(UserInfo userInfo);
  abstract public void deleteUserInfo(UserInfo userInfo);
}
