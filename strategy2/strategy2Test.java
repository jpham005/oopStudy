package strategy2;

import strategy2.domain.userinfo.UserInfo;
import strategy2.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import strategy2.domain.userinfo.dao.oracle.UserInfoOracleDao;
import strategy2.userinfo.web.UserInfoClient;

public class strategy2Test {
  public static void main(String args[]) {
    UserInfo user = new UserInfo();

    user.setPasswd("password");
    user.setUserId("12345");
    user.setUserName("jaham");

    UserInfoClient mysqlClient = new UserInfoClient(new UserInfoMySqlDao());
    UserInfoClient oracleClient = new UserInfoClient(new UserInfoOracleDao());

    mysqlClient.insertUser(user);
    mysqlClient.updateUser(user);
    mysqlClient.deleteUser(user);
    oracleClient.insertUser(user);
    oracleClient.updateUser(user);
    oracleClient.deleteUser(user);
  }
}
