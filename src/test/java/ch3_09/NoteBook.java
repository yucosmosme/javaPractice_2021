package ch3_09;

//얘는 상위 클래스의 추상메서드 2개 중에 하나만 구현하였으므로
//얘도 추상클래스가 되어야 함. abstract 붙여야됨
public abstract class NoteBook extends Computer{

    @Override
    void typing() {
        System.out.println("NoteBook typing");
    }
}
