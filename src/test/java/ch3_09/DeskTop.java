package ch3_09;

// 추상 클래스를 상속받을때
// 추상 메서드들을 구현을 해야됨.
// 그렇지 않으면 얘도 추상 클래스여야 함. abstract 붙여야됨.

//근데 구현 모두 했는데도 abstracts 로 냅둘 수 있음
//상속만을 위한 클래스일때는.
public class DeskTop extends Computer{

    //상위 클래스의 추상메서드 여기에서 구현
    @Override
    void display() {
        System.out.println("DeskTop display");
    }

    //상위 클래스의 추상메서드 여기에서 구현
    @Override
    void typing() {
        System.out.println("DeskTop typing");
    }

    //얘는 그냥 상위클래스 재정의
    @Override
    public void turnOff() {
        System.out.println("Desktop turnoff");
    }
}
