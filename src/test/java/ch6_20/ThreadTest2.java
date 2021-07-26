package ch6_20;

class MyThread2 implements Runnable{

    public void run(){

        int i;
        for(i=0; i<200; i++){

            System.out.print(i + "\t");


        }
    }
}

/*
* Runnable 인터페이스 구현하여 만들기

* 자바는 다중 상속이 허용되지 않으므로
* 이미 다른 클래스를 상속한 경우 thread를 만들기 위해
* Runnable interface를 구현하도록 한다.
*/

public class ThreadTest2 {

    public static void main(String[] args) {

        System.out.println("main start");

        MyThread2 mth = new MyThread2();
        Thread th1 = new Thread(mth);
        th1.start();

        Thread th2 = new Thread(new MyThread2());
        th2.start();

        System.out.println("main end");
    }

}
