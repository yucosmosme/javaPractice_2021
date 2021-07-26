package ch6_21;

/*
* 21. Thread 클래스의 여러 메서드들

Thread 우선순위
Thread.MIN_PRIORITY(=1) ~ Thread.MAX_PRIORITY(=10)
디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)
우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다
setPriority()/getPriority()
Thread 우선순위 예제
* */
class PriorityThread extends Thread{

    public void run(){

        int sum = 0;

        Thread t = Thread.currentThread();
        System.out.println( t + "start");

        for(int i =0; i<=1000000; i++){

            sum += i;
        }

        System.out.println( t.getPriority() + "end");
    }
}

public class PriorityTest {

    public static void main(String[] args) {
        int i;

        PriorityThread pt1 = new PriorityThread();
        PriorityThread pt2 = new PriorityThread();
        PriorityThread pt3 = new PriorityThread();

        pt1.setPriority(Thread.MIN_PRIORITY); //우선순위 낮음
        pt2.setPriority(Thread.NORM_PRIORITY);
        pt3.setPriority(Thread.MAX_PRIORITY); //우선순위 높음

        pt1.start();
        pt2.start();
        pt3.start();
    }
}
