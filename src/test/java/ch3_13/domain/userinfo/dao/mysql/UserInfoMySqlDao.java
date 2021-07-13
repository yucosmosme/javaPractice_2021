package ch3_13.domain.userinfo.dao.mysql;

import ch3_13.domain.userinfo.UserInfo;
import ch3_13.domain.userinfo.dao.UserInfoDAO;

//UserInfoDao 인터페이스를 구현한 MySql 버전 dao
public class UserInfoMySqlDao implements UserInfoDAO {


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId() );
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInf(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());
    }
}
