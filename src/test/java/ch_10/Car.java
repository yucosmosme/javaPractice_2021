package ch_10;

public abstract class Car {

    /*
    * 10. 추상 클래스의 응용 - 템플릿 메서드 패턴
    템플릿 메서드
    추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
    final로 선언하여 하위 클래스에서 재정의 할 수 없게 함. 중요한 흐름을 가지고 있기 때문.
    프레임워크에서 많이 사용되는 설계 패턴
    추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고
    하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함
    *
    *
    *final 예약어
    final 변수 : 값이 변경될 수 없는 상수
    public static final double PI = 3.14;
    *
    final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
    final 클래스 : 상속할 수 없는 클래스
    *
    *
    * */


    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    //템플릿 메서드 - 코드의 흐름(시나리오)를 정의
    //final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
    final public void run(){
        startCar(); //시동켬
        drive(); //주행
        stop(); //멈춤
        turnOff(); //시동끔
    }

}
