package ch6_10;


/*
* 10. 사용자 정의 예외 클래스와 그 활용

* 자바에서 제공되는 예외 클래스외에 프로그래머가 직접 만들어야 하는 예외가 있을 수 있음
기존 예외 클래스중 가장 유사한 예외 클래스에서 상속 받아 사용자 정의 예외 클래스를 만든다.
기본적으로 Exception 클래스를 상속해서 만들 수 있음
* */

//illegalArgumentException: 부정한 인수, 또는 부적절한 인수를 메서드에 건네준 것
public class PasswordException extends IllegalArgumentException{
    //패스워드에 대한 예외 처리 하기
    //
    //패스워드를 입력할 때 다음과 같은 경우 오류처리를 합니다.
    //비밀번호는 null일 수 없습니다.
    //비밀번호의 길이는 5이상입니다.
    //비밀번호는 문자로만 이루어져서는 안됩니다.(하나이상의 숫자나 특수문자를 포함)

    public PasswordException(String message){

        //super와 super():
        /*
        *1. super
        super는 자식 클래스가 부모 클래스로부터 상속받은 멤버를 참조할 때 사용하는 참조 변수입니다. 클래스 내의 멤버변수와 지역변수의 이름이 같을 경우 구분을 위해 this를 사용하듯이 부모 클래스와 자식 클래스의 멤버의 이름이 같을 경우 super를 사용합니다.
        * this와 super는 인스턴스의 주소값을 저장하는데 static 메서드(클래스 메서드)와는 무관하게 사용됩니다.

        * 2. super()
        super()는 부모 클래스의 생성자를 호출하는 메서드입니다.
        * 상속받은 자식 클래스가 부모 클래스의 멤버를 사용할 경우가 있을 수도 있으므로 부모 클래스를 우선적으로 초기화해줘야 합니다. 부모 클래스의 생성자는 자식 클래스의 생성자 첫줄에서 호출해줍니다. 이러한 부모 클래스에 대한 생성자 호출은 상속관계에 따라 Object 클래스까지 올라가서 마무리됩니다.
        *
        * */
        super(message); //부모 클래스의 생성자를 호출.
    }

}