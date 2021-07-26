package ch6_20;


/*
* 20. 자바에서 Thread 만들기

Thread 란?

process
실행 중인 프로그램
프로그램이 실행되면 OS로 부터 메모리를 할당받아 프로세스 상태가 됨

thread
하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread임

multi-threading
여러 thread가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과
* 실제로는 번갈아가며 스위칭하는거.

thread는 각각 자신만의 작업 공간을 가짐 ( context )
각 thread 사이에서 공유하는 자원이 있을 수 있음 (자바에서는 static instance)
여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 race condition이 발생할 수 있음
이렇게 여러 thread가 공유하는 자원중 경쟁이 발생하는 부분을 critical section 이라고 함
critical section에 대한 동기화( 일종의 순차적 수행)를 구현하지 않으면 오류가 발생할 수 있음
*
*
* */

//방법 1: thread 상속
class MyThread extends Thread {
    public void run(){
        int i;
        for (i=1; i<=200; i++){
            System.out.println(i+"\t");
        }
    }
}

public class ThreadTest extends Thread{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + "end");

        //이렇게 찍으면 메인쓰레드 먼저 시작하고 끝남
        //그뒤로 th1과 th2가 번갈아가면서 하다가 끝남
    }

}
