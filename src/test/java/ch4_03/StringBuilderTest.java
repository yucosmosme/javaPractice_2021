package ch4_03;

public class StringBuilderTest {

    public static void main(String[] args) {

        //StringBuilder
        //부적으로 가변적인 char[]를 멤버 변수로 가짐
        //문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
        //새로운 인스턴스를 생성하지 않고 char[] 를 변경함

        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));

        //찍어보면 append 전 후의 주소값이 동일
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));

        String test = buffer.toString();
        System.out.println(test);
    }
}
