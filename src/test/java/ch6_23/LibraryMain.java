package ch6_23;

import java.util.ArrayList;

/*
* 23. wait()/notify() 에서드를 활용한 동기화 프로그래밍

리소스가 어떤 조건에서 더 이상 유효하지 않은 경우 리소스를 기다리기 위해
* Thread 가 wait() 상태가 된다.
wait() 상태가 된 Thread은 notify() 가 호출 될 때까지 기다린다.
*
유효한 자원이 생기면 notify()가 호출되고 wait() 하고 있는 Thread 중
* 무작위로 하나의 Thread를 재시작 하도록 한다.
*
notifyAll()이 호출되는 경우 wait() 하고 있는 모든 Thread가 재시작 된다.
이 경우 유효한 리소스만큼의 Thread만이 수행될 수 있고 자원을 갖지 못한 Thread의 경우는
* 다시 wait() 상태로 만든다.
자바에서는 notifyAll() 메서드의 사용을 권장한다. (notify()로 하면 영원히 깨워지지 않는 쓰레드가 생길 수 있어서.)

* */

//* 도서관에서 책을 빌리는 예제 - 책은 한정, 학생은 많음.
//책이 없으면 wait()시킨다.

//BM책방
class BMLibrary{
    public ArrayList<String> shelf = new ArrayList<>();

    //구비된 책 리스트
    public BMLibrary(){
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
        shelf.add("태백산맥4");
        shelf.add("태백산맥5");
    }

    //책빌림: 리스트에서 뺀다.
    //책빌림과 반납은 동기화 : synchronized
    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        //책이 없으면 기다려라
        // 여러 기다리는 애들 중에 끝까지 못빌리는 애가 생길 수 있으므로
        //while문으로 기다리는 애가 없을때까지 반복해줌
        while (shelf.size() == 0){
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }

        //순차적으로 하나씩 책 빌림(로그에서는 순서대로 안찍힐 수 있음)
        String book = shelf.remove(0);
        System.out.println(t.getName() + " lent "+ book);
        return book;
    }

    //책 반납: 리스트에 추가
    public synchronized void returnBook(String book){
        Thread t = Thread.currentThread();

        shelf.add(book);
        //책이 추가되면 여기서 notify()를 해줘야 wait()가 끝난다.!!!!!
        notifyAll();
        System.out.println(t.getName() + " returned " + book );
    }
}

//학생 개체. 쓰레드로 구현.
class Student extends Thread{

    public Student (String studentName){
        super(studentName); //Student가 Thread를 상속받으므로 여기서 super는 쓰레드
    }

    public void run(){
        try {
            String title = LibraryMain.library.lendBook(); //학생이 빌린 책. (리스트에서 0번째 책으로 빌림)
            if (title == null) {
                System.out.println( getName() + "빌리지 못했음");
                return; //책 못빌리면 여기서 끝냄
            }

            sleep(5000); //책 읽음 ㅋ

            LibraryMain.library.returnBook(title); //책 반납
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static BMLibrary library = new BMLibrary();

    public static void main(String[] args) {
        //학생 쓰레드 생성
        Student std1 = new Student("std1 ");
        Student std2 = new Student("std2 ");
        Student std3 = new Student("std3 ");
        Student std4 = new Student("std4 ");
        Student std5 = new Student("std5 ");
        Student std6 = new Student("std6 ");
        Student std7 = new Student("std7 ");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
        std7.start();
    }

}
