package strategy2.userinfo.web;

import strategy2.domain.userinfo.UserInfo;
import strategy2.domain.userinfo.dao.UserInfoDao;

public class UserInfoClient {
  private final UserInfoDao userInfoDao;

  public UserInfoClient(UserInfoDao userInfoDao) {
    this.userInfoDao = userInfoDao;
  }

  public void insertUser(UserInfo user) {
    userInfoDao.insert(user);
  }

  public void updateUser(UserInfo user) {
    userInfoDao.update(user);
  }

  public void deleteUser(UserInfo user) {
    userInfoDao.delete(user);
  }
}
