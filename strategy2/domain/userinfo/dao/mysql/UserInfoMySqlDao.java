package strategy2.domain.userinfo.dao.mysql;

import strategy2.domain.userinfo.UserInfo;
import strategy2.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
  @Override
  public void insert(UserInfo user) {
    System.out.printf("insert into MYSQL DB userId = %s\n", user.getUserId());
  }

  @Override
  public void update(UserInfo user) {
    System.out.printf("update into MYSQL DB userId = %s\n", user.getUserId());
  }

  @Override
  public void delete(UserInfo user) {
    System.out.printf("delete into MYSQL DB userId = %s\n", user.getUserId());
  }
}
