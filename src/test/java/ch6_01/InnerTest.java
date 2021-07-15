package ch6_01;

class OutClass{

    /*
    * 01. 여러 내부 클래스의 정의와 유형

    내부 클래스란? (inner class)
    클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관이 있는 경우가 많고,
    다른 외부 클래스에서 사용할 일이 거의 없는 경우에 내부 클래스로 선언해서 사용함.
    * 내부에서만 쓰려고 만든 클래스
    중첩 클래스라고도 함

    내부 클래스의 종류
    인스턴스 내부 클래스, 정적(static) 내부 클래스, 지역(local) 내부 클래스, 익명(anonymous) 내부 클래스

    인스턴스 내부 클래스
    내부적으로 사용할 클래스를 선언 (private으로 선언하는 것을 권장)
    외부 클래스가 생성된 후 생성됨 ( 정적 내부 클래스와 다름 )
    * private로 많이 선언하는데, private이 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있음
    *
    * 코딩할때 내부클래스를 그렇게 많이 쓰진 않음.
    * */

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass(); // 내부 클래스 생성
    }

    //이너클래스 - 보통 private으로 선언
    private class InClass{

        int inNum = 100;
//        static int sInNum = 500; //에러남. 인스턴스 이너클래스는 아웃터클래스(밖의 클래스)가 생성되고 나서 생성됨. 근데 static은 인스턴스 생성과 상관없이 쓸수 있도록 하는 거이므로.
        void inTest(){
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
        }
        //static void sTest(){  //에러 남

        //}

    }

    public void usingClass(){
        inClass.inTest(); //요런식으로 호출함
    }

    // 정적 내부클래스
    //외부 클래스 생성과 무관하게 사용할 수 있음
    //정적 변수, 정적 메서드 사용
    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){ //정적 클래스의 일반 메서드
            //num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
        }

        static void sTest(){  // 정적 클래스의 static 메서드
            //num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            //inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
            // ( -> 인스턴스 변수는 생성뒤에 쓸수있는건데 static 메서드는
            // 인스턴스 생성전에도 호출될 수 있어야 하니까 )
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
        }

    }

}

//밖에서 사용해보기.
public class InnerTest {

    public static void main(String[] args) {
          // 이너클래스 외부클래스에서 호출하기
//        OutClass outClass = new OutClass();
//        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//        outClass.usingClass();
//        System.out.println();

        //이너클래스가 private이 아닐 경우는 아래와 같이 사용가능함. 하지만 거의 이렇게 하지 않음.
//        OutClass.InClass inClass = outClass.new InClass();
//        System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
//        inClass.inTest();

        //static 내부 클래스는 :
        // 외부 클래스 생성하지 않고(new 안해도됨) 바로 정적 내부 클래스 생성
        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();
        inStaticClass.sTest();
    }
}
