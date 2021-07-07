public class UserInfo {

    public String userId;
    public String userPassWord;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    //기본생성자
    public UserInfo(){}

    //내가 만든 생성자 - 매개변수 받아와서 멤버변수에 저장
    public UserInfo(String userId, String userPassWord, String userName) {
        this.userId = userId;
        this.userPassWord = userPassWord;
        this.userName = userName;
    }

    //메서드
    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
    }
}
