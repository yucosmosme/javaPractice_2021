package ch3_14;

import ch3_11.CompleteCalc;

public class CalculatorTest {

    public static void main(String[] args) {
        CompleteCalc calc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        //자바8 이후 사용 가능. defalut 메서드는 인스턴스 생성시 걍 사용가능함.
//       calc.description();
        int[] arr = {1,2,3,4,5};
        //total()은 static 메서드라서 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
        System.out.println(Calc.total(arr));
    }
}
