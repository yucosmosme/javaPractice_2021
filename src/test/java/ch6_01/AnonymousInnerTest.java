package ch6_01;

class Outer2{

    int outNum = 100;
    static int sNum = 200;

    // 메서드가 Rnnable한 인터페이스 타입으로 리턴
    // 보통 클래스를 쓰레드로 만들때 사용
    Runnable getRunnable(int i){

        int num = 10;

        /*
        * 익명 내부 클래스
        이름이 없는 클래스 (위 지역 내부 클래스의 MyRunnable 클래스 이름은 실제로 호출되는 경우가 없음)
        클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
        인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환 할 수 있음.
        widget의 이벤트 핸들러에 활용됨
        * */
        return new Runnable(){

            int localNum = 1000;

            @Override
            public void run() {
//                num = 200;   //값을 바꾸려고 하면 에러 남. 위의 외부클래스의 호출되면 스택에 잡히고 나서 없어지는 반면
                //여기 run()은 또 호출될수도 있는데 그때는 이 num 변수가 없어질 수 있기 때문에
                // -> num을 final로 잡아야 함. (지금은 final로 선언 안해도 알아서 바뀜)
//                i = 10;      //에러 남
                System.out.println("i"+ i);
                System.out.println("num" + num);
                System.out.println("localNum" + localNum); //로칼변수
                System.out.println("outNum" + outNum); //외부클래스의 정적변수
            }
        };
    }

}

public class AnonymousInnerTest {
    public static void main(String[] args) {

        Outer2 outer2 = new Outer2();
        Runnable runnable = outer2.getRunnable(100);
        //여기서 호출이 끝나면 변수는 스택에서 없어지기 때문에
        // 그러지 않고 계속 쓰기 위해서 final로 바뀌는 것

        runnable.run();
    }
}
