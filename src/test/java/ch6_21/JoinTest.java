package ch6_21;

public class JoinTest extends Thread {

    /*
    * join()
    동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join() 함수를 사용
    join() 함수를 호출한 Thread가 not-runnable 상태가 감
    다른 Thread의 수행이 끝나면 runnable 상태로 돌아옴
    *
    * interrupt()
    다른 Thread에 예외를 발생시키는 interrupt를 보낸다.
    Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때 interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
    * */
    int start;
    int end;
    int total;

    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        int i;
        for (i = start; i<=end; i++){
            total += i;
        }
    }

    public static void main(String[] args) {

        //쓰레드는 현재 메인쓰레드, jt1, jt2 총 세개임
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        //스타트 후 조인을 걸면 메인은 수행 안하고 조인이 끝날때까지 기다림.(not runnable)
        //혹시 조인이 안끝나면 InterruptedException을 걸어줘서 메인을 다시 깨운다..

        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int lastTotal = jt1.total + jt2.total;

        System.out.println("jt1.total = " + jt1.total );
        System.out.println("jt2.total = " + jt2.total );

        System.out.println("lastTotal = " + lastTotal);
    }
}
