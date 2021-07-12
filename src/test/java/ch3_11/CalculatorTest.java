package ch3_11;

public class CalculatorTest {

    public static void main(String[] args) {
        // CompleteCalc.java는
        // Calc 인터페이스를 구현한 Calculator.java를 상속받았으므로
        // Calc.java의 타입이라고 볼 수 있기 때문에 아래와 같이 작성
//        인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
        //    형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능함
        // Calc에 있는 메서드만 구현 가능.
        Calc calc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
    }
}
