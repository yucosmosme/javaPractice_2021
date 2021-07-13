package ch3_13.domain.userinfo.dao.oracle;

import ch3_13.domain.userinfo.UserInfo;
import ch3_13.domain.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDao implements UserInfoDAO {


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId() );
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInf(UserInfo userInfo) {
        System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
    }
}
