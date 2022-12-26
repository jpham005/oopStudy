package strategy2.domain.userinfo.dao.oracle;

import strategy2.domain.userinfo.UserInfo;
import strategy2.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
  @Override
  public void insert(UserInfo user) {
    System.out.printf("insert into ORACLE DB userId = %s\n", user.getUserId());
  }

  @Override
  public void update(UserInfo user) {
    System.out.printf("update into ORACLE DB userId = %s\n", user.getUserId());
  }

  @Override
  public void delete(UserInfo user) {
    System.out.printf("delete into ORACLE DB userId = %s\n", user.getUserId());
  }
}
