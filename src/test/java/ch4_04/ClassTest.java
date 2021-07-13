package ch4_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

//        Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함
        //클래스 이름으로 직접 Class 클래스 가져오기
        Class c1 = Class.forName("ch4_04.Person");

        //new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성할 수 있음
        Person person = (Person) c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        //또다른 class 가져오는 방법 : 생성된 인스턴스에서 Class 클래스 가져오기 getClass()
//        getClass 쓰려면 이미 Person 인스턴스가 있는 상태여야 함
//        Class c2 = person.getClass();
//        Person p = (Person) c2.newInstance();
//        System.out.println(p);
//
//        Class[] parameterTypes = {String.class};
//        //생성자 찾아서 반환해줌
//        Constructor cons = c2.getConstructor(parameterTypes);
//
//        Object[] initargs = {"Kim"};
//        //kim 변수 넣고 인스턴스 생성
//        Person kimPerson = (Person) cons.newInstance(initargs);
//        System.out.println(kimPerson);

//        위의 껏은 아래와 같다. 보통은 아래와같이 쓰지만,
        // 객체타입을 모르면 위처럼 getConstructor로 생성자 찾아서 인스턴스 만들어주면 된다.
//        Person kim2 = new Person("Kim");
    }
}
