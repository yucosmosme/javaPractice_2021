package ch4_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {

    public static void main(String[] args) throws ClassNotFoundException {

        //자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
        //Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
        //Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함

        //클래스 이름으로 직접 Class 클래스 가져오기
        Class c = Class.forName("java.lang.String");

        //reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고 인스턴스를 생성하고,
        //메서드를 호출하는 방식의 프로그래밍
//        로컬 메모리에 객체 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용
//        java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍
//        일반적으로 자료형을 알고 있는 경우엔 사용하지 않음
        Constructor[] cons = c.getConstructors();
        for(Constructor co : cons){
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for (Method mth : m){
            System.out.println(mth);
        }

    }
}
