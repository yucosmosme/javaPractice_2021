package ch6_01;

class Outer{

    int outNum = 100;
    static int sNum = 200;


    Runnable getRunnable(int i){

        int num = 100;
        /*
        * 지역 내부 클래스
        (지역 변수와 같이) 메서드 내부에서 정의하여 사용하는 클래스
        메서드의 호출이 끝나면 메서드에 사용된 지역변수의 유효성은 사라짐
        메서드 호출 이후에도 사용해야 하는 경우가 있을 수 있으므로 지역 내부 클래스에서 사용하는 메서드의 지역 변수나 매개 변수는
        final로 선언됨
        * */
        class MyRunnable implements Runnable{

            int localNum = 10;

            @Override
            public void run() {
                //num = 200;   //에러 남. 지역변수는 상수로 바뀜
                //i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
                // //값을 바꾸려고 하면 에러 남. 위의 외부클래스의 호출되면 스택에 잡히고 나서 없어지는 반면
                //여기 run()은 또 호출될수도 있는데 그때는 이 num 변수가 없어질 수 있기 때문에
                // -> num을 final로 잡아야 함. (옛날엔 강제선언이었는데 지금은 final로 선언 안해도 알아서 바뀜)
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerTest {

    public static void main(String[] args) {

        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
