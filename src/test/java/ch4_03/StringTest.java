package ch4_03;

public class StringTest {

    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        //concat하면 그 메모리에 덮어씌우는게 아니라 새 메모리에 쓰여짐
        //그래서 이 방법을 많이 쓰면 메모리 garbage가 많이 생긴다. 조심.
        java = java.concat(android);

        //찍어보면 concat 전,후가 서로 다름
        System.out.println(System.identityHashCode(java));

    }
}
