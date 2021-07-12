package ch3_11;

public interface Calc {

    /*
    * 인터페이스란?
    모든 메서드가 추상 메서드로 선언됨 public abstract
    모든 변수는 상수로 선언됨 public static final
    * (내가 그러케 선언하지 않아도 컴파일 과정에서 셋팅)
    * 자바 8 부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능의 제공으로 일부 구현 코드가 있음
    *
    * 인터페이스는 상속한다고 하지 않고, '구현'한다고 함.
    *
    * 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
    Calc calc = new CompleteCalc();
    상속에서의 형 변환과 동일한 의미
    클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있음 ( cf. extends)
    형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능함
    *
    *인터페이스가 하는 일
    클래스나 프로그램이 제공하는 기능을 명시적으로 선언
    일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 명세(specification)
    클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음
    어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미임
    인터페이스를 구현한 다양한 객체를 사용함 - 다형성

    * 예) JDBC 인터페이스
    * java는 connection 인터페이스만 제공하고
    * Oracle, mysql, mssql에서 그 인터페이스를 구현함. 그거를 jar파일로 우리에게 제공해줌.
    * 그럼 우리는 그냥 jar파일을 쓰면 됨.
    *
    * */

    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

}
