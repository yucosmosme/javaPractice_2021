package ch6_22;

/*
* 22. 멀티 Thread 프로그래밍에서의 동기화

critical section 과 semaphore
critical section  은 두 개 이상의 thread가 동시에 접근 하는 경우 문제가 생길 수 있기 때문에 동시에 접근할 수 없는 영역
semaphore 는 특별한 형태의 시스템 객체이며 get/release 두 개의 기능이 있다.
한 순간 오직 하나의 thread 만이 semaphore를 얻을 수 있고, 나머지 thread들은 대기(blocking) 상태가 된다.
semaphore를 얻은 thread 만이 critical section에 들어갈 수 있다.
*
* 동기화 (synchronization)
두 개의 thread 가 같은 객체에 접근 할 경우, 동시에 접근 함으로써 오류가 발생
동기화는 임계영역에 접근한 경우 공유자원을 lock 하여 다른 thread의 접근을 제어
동기화를 잘못 구현하면 deadlock에 빠질 수 있다.
*
* 자바에서는 synchronized 메서드나 synchronized 블럭을 사용

* synchronized 블럭
-현재 객체 또는 다른 객체를 lock으로 만든다.
synchronized(참조형 수식) {
      수행문;
}

synchronized 메서드
객체의 메소드에 synchronized 키워드 사용
현재 이 메서드가 속해있는 객체에 lock을 건다.
자바에서는 deadlock을 방지하는 기술이 제공되지 않으므로
* 되도록이면 synchronized 메서드에서 다른 synchronized 메서드는 호출하지 않도록 한다. !!!

* */

class Bank{
    private int money = 10000;

    //입금
    //입금과 출금은 동시에 못하게 동기화를 시켜야함
    //동기화가 필요한 메서드에 syncronized 키워드를 붙이면 됨.
    public synchronized void saveMoney(int savingAmount){
        int m = getMoney();

        try {
            /*
            Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때
            interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
            * */
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m + savingAmount); //입금한후 잔액
    }

    //출금 : synchronized
    public synchronized void minusMoney(int minusAmount){

        int m = getMoney();

        try {
            /*
            Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때
            interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
            * */
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m -minusAmount); //입금한후 잔액
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

//park은 입금 : 쓰레드 처리
class Park extends Thread{

    public void run(){
        System.out.println("start saving");
        SyncMain.myBank.saveMoney(3000);
        System.out.println("saving amount: "+ SyncMain.myBank.getMoney());
    }
}

//와이프는 돈을 씀 : 쓰레드 처리
class ParkWife extends Thread{

    public void run(){
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney() );

    }
}


public class SyncMain {

    //이게 park과 와이프가 공유할 shared resource라서 static
    public static Bank myBank = new Bank();

    public static void main(String[] args) {

        //이렇게 코딩하면 입금과 출금 메서드에 syncronized 되어있으니까
        //park의 쓰레드가 sleep()하는 2초도 다 끝나고 입금 메서드 끝날때까지
        //parkwife의 쓰레드의 출금 메서드가 기다림
        //박 입금
        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200); //쓰레드 2초 슬립
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //와이프 출금
        ParkWife pw = new ParkWife();
        pw.start();
    }
}
