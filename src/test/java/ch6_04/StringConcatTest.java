package ch6_04;

public class StringConcatTest {

    public static void main(String[] args) {

        /*
        * 익명 객체를 생성하는 람다식
        자바에서는 객체 없이 메서드가 호출 될 수 없음
        람다식을 구현하면 익명 내부 클래스가 만들어지고,
        * 이를 통해 익명 객체가 생성됨
        * */


        //연결할 단어
        String s1 = "Taemin";
        String s2 = "I love you.";

        //방법1
        //인터페이스를 구현한 클래스의 인스턴스를 생성하여 메서드 호출
        StringConcatImpl strImp = new StringConcatImpl();
        strImp.makeString(s1, s2);

        //방법2
        //인터페이스를 람다식으로 구현 (즉, 클래스 만드는 부분 생략)
        //위와 같은 결과 도출
        //가능한 이유: 아래 과정에서 내부적으로 익명 클래스가 만들어짐.
        //그렇기 때문에 메서드도 하나만 만들어야함 (익명클래스는 메서드 1개만 가능)
        StringConcat concat = (s, v) -> System.out.println(s +"," + v);
        concat.makeString(s1, s2);
    }

}
