package ch3_13.userinfo.web;

import ch3_13.domain.userinfo.UserInfo;
import ch3_13.domain.userinfo.dao.UserInfoDAO;
import ch3_13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch3_13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient{

    public static void main(String[]args) throws IOException {

        //파일 정보 읽어들여서 db 종류 선택
        FileInputStream fis = new FileInputStream("src/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE"); //해당 엔진 반환 ex. oracle, mysql...

        //id, pw, username
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("m1234");
        userInfo.setUserName("mini");
        userInfo.setPasswd("123");


        //인터페이스 타입으로 저장시킴.
        UserInfoDAO userInfoDAO = null;

        //db 엔진에 따라서 다른 dao를 가져옴
        //각 oracleDao, MysqlDao는 그 상위의 UserInfoDAO 인터페이스를 구현한 것.
        //이렇게 아래에서 별도로 구현하게 해야지
        // 셋팅 자체가 따로따로 되어있으면 관리가 힘들다.
        if (dbType.equals("ORACLE")){
            userInfoDAO = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDAO = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }


        userInfoDAO.insertUserInfo(userInfo);
        userInfoDAO.updateUserInfo(userInfo);
        userInfoDAO.deleteUserInf(userInfo);
    }

}
