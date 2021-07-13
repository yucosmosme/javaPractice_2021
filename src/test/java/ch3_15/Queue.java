package ch3_15;

public interface Queue {

    //인터페이스: 모든 메서드가 추상 메서드로 선언됨 : 구현부 없음

    //큐에 넣음
    void enQueue(String title);

    //큐 하나씩 비움
    String deQueue();

    //큐 안에 몇개가 있나
    int getSize();
}
