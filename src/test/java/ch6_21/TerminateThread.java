package ch6_21;

import java.io.IOException;

public class TerminateThread extends Thread{

    /*
    * Thread 종료하기

    Thread를 종료할 때 사용함
    무한 반복의 경우 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴

    Thread 종료하기 예제
      세 개의 thread를 만든다.
      각각 무한 루프를 수행하게 한다.
      작업 내용 this.sleep(100);

      ‘A’ 를 입력 받으면 첫 번째 thread를
      ‘B’ 를 입력 받으면 두 번째 thread를
      ‘C’ 를 입력 받으면 세 번째 thread를
      ‘M’을 입력 받으면 모든 thread와 main() 함수를 종료한다.
    * */

    private boolean flag = false;
    int i;

    public TerminateThread(String name){
        super(name);
    }

    public void run(){


        while(!flag){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println( getName() + " end" );

    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }


    public static void main(String[] args) throws IOException {

        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        TerminateThread threadC = new TerminateThread("C");

        threadA.start();
        threadB.start();
        threadC.start();

        int in;
        while(true){
            in = System.in.read(); //글자 입력받음
            if ( in == 'A'){ //A 입력받으면 A쓰레드 중지
                threadA.setFlag(true);
            }else if(in == 'B'){
                threadB.setFlag(true);
            }else if( in == 'C'){
                threadC.setFlag(true);
            }else if( in == 'M'){
                threadA.setFlag(true);
                threadB.setFlag(true);
                threadC.setFlag(true);
                break;
            }else{
                System.out.println("type again");
            }
        }

        System.out.println("main end");

    }
}
