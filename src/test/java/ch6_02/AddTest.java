package ch6_02;

public class AddTest {

    public static void main(String[] args) {

        //람다식 구현
        Add add = (x, y) -> { return x+y;};

        //람다식 호출
        System.out.println(add.add(3,4));


        /*
        * 람다식 문법

        익명 함수 만들기
        매개 변수와 매개변수를 이용한 실행문 (매개변수) -> {실행문;}
        두 수를 입력 받아 더하는 add() 함수 예

        int add(int x, int y){
            return x+y;
        }

        람다식으로 표현
        (int x, int y) -> {return x+y;}

        매개 변수가 하나인 경우 자료형과 괄호 생략가능
        str->{System.out.println(str);}

        매개변수가 두 개이상인 경우 괄호를 생략할 수 없음
        x, y -> {System.out.println(x+y);}  //오류

        실행문이 한 문장인 경우 중괄호 생략 가능
        str-> System.out.println(str);

        실행문이 한 문장이라도 return문(반환문)은 중괄호를 생략할 수 없음
        str-> return str.length();  //오류

        실행문이 한 문장의 반환문인 경우엔 return과 중괄호를 모두 생략
        (x, y) -> x+y;
        str -> str.length;
        * */
    }
}
