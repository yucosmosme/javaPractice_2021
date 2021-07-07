package ch12;

public class Person {

    /*
    * this가 하는 일
    인스턴스 자신의 메모리를 가리킴
    생성자에서 또 다른 생성자를 호출 할때 사용
    자신의 주소(참조값)을 반환 함
    *
    * this는 인스턴스 내부에서 자기 자신의 메모리 주소를 가짐.
    * 같은 클래스 내에서 한 생성자에서 다른 생성자를 호출할떄 this를 사용한다.
    *
    * */


    String name;
    int age;

    //다른 생성자 호출 방법: this(매개변수 타입 맞아야 함)
    //이 떄 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음
    public Person(){
        // 이렇게 흔하게 호출함. 호출해서 멤버변수 셋팅.
        this("이름없음", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //반환타입 은 Person으로 자기 자신임. -> return this
    public Person getPerson(){
        return this;
    }

    public void showPerson(){
        System.out.println(name+ "," + age);
    }

    //런 테스트
    public static void main(String[] args) {

        Person person = new Person();

        person.showPerson();
        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2);

        //위에꺼와 아래꺼의 출력 결과는
        //ch12.Person@2a139a55로 같은 메모리를 가리킴
        //즉 this.는 같은 메모리를 가리킨다는 것.
    }


}