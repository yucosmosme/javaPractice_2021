package ch18;

public class Company {

    //싱글톤 패턴이란?
    //프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
    //static 변수, 메서드를 활용하여 구현 할 수 있음

    //날짜 같은 것들은 한개만 가질 수 있음. 시분초가 동일해야돼서.
    //회사라는 객체도 유일. --> 이럴때 싱글톤 패턴을 쓴다.

    //유일한 객체를 하나 만듦. 이거는 외부에서 접근 못하게 private
    private static Company instance = new Company();

    //생성자 - 컴파일러가 마음대로 기본생성자 제공 못하도록 내가 만듦.
    private Company(){

    }

    // 위에서 선언한 유일한 객체를 외부에서 호출할 수 있도록 get 메소드 제공. public static 붙임
    //getInstance 메서드를 통해 모든 클라이언트에게 동일한 인스턴스를 반환하는 작업을 수행한다.
    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }


}
