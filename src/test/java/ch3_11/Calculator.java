package ch3_11;

//인터페이스 구현(상속이라고 안함)
//모든 인터페이스의 메서드는 추상메서드
//-> 이걸 구현한다면 거기의 추상메서드를 모두 구현하지 않는다면
// 얘도 추상클래스가 되어야 함.abstract로 명시해줘야함.
public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
