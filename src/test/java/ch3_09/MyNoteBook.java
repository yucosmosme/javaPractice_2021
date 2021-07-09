package ch3_09;

//상속 순서: Computer > NoteBook > MyNoteBook
//Computer의 추상메서드 2개인데
// 그중 하나를 NoteBook에서 구현하였고
// 나머지 하나를 그거의 자식인 여기에서 구현하였으므로.
// 여기에서는 추상메서드 모두 구현되었으므로
// 추상클래스 abstract이 아니어도 됨.
public class MyNoteBook extends NoteBook{

    @Override
    void display() {
        System.out.println("MyNoteBook display");
    }
}
