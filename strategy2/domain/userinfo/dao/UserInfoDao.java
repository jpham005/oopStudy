package strategy2.domain.userinfo.dao;

import strategy2.domain.userinfo.UserInfo;

public interface UserInfoDao {
  public void insert(UserInfo user);

  public void update(UserInfo user);

  public void delete(UserInfo user);
}
