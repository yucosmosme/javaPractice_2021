package ch6_03;

public class MyNumberTest {

    public static void main(String[] args) {

        // 리턴문 한줄이면 중괄호 생략
        // 인터페이스의 자료형 변수로 함수 호출. 람다식으로 구현
        // x, y중에 큰 값 리턴
        MyNumber myNumber = (x, y) -> x > y ? x : y;

        System.out.println( myNumber.getMax(10, 20));
    }
}
