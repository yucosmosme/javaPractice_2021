public class UserInfoTest {

    public static void main(String[] args) {

        // 기본생성자를 이용한 인스턴스 생성
        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "zxcvbn12345";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01034556699";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());

        // 내가 만든 생성자를 이용한 인스턴스 생성
        UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}
