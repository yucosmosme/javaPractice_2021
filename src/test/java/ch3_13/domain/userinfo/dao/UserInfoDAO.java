package ch3_13.domain.userinfo.dao;

import ch3_13.domain.userinfo.UserInfo;

//여기서 인터페이스만 선언하고나면
//나중에 db 엔진에 맞게 구현해서 쓰면 됨.
public interface UserInfoDAO {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInf(UserInfo userInfo);

}
