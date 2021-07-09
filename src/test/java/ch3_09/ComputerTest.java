package ch3_09;

public class ComputerTest {

    public static void main(String[] args) {
        // 추상클래스는 인스턴스화 new 할 수 없음.
        // 추상메서드의 구현코드가 없으므로 호출됐을때 실행될 수 없기 때문.

        // DeskTop은 추상클래스 아니므로 인스턴스화함
        Computer computer = new DeskTop();
        //DeskTop은 Computer 상속받았으므로 COmputer의 클래스 모두 호출 가능.
        //재정한거나 추상메서드 구현한거는 그거대로 나옴.
        computer.turnOn();
        computer.turnOff();
        computer.display();
        computer.typing();

        // 얘도 추상클래스 아니므로 인스턴스화함
        NoteBook myNote = new MyNoteBook();
    }
}
