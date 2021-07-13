package ch5_05;

import ch5_03.MyLinkedList;
import ch5_03.MyListNode;

/*
* 큐 : linkedlist로 구현
* */


//인터페이스 밑에서 구현
interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printAll();
}

public class MyListQueue extends MyLinkedList implements Queue {

    MyListNode front; //여기부터 쌓임. 뺄때는 여기부터 뺌
    MyListNode rear; //여기로 들어가고

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()){ //isEmpty() 이미 구현되어있음
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else {
            newNode = addElement(data);
            rear = newNode; //뒤에 추가
        }
        System.out.println(newNode.getData() + "added");
    }

    @Override
    public String deQueue() {

        if (isEmpty()){
            return null;
        }
        String data = front.getData(); //뺼때 앞에있는것부터 뺌
        front = front.next; // front에 그다음꺼로 지정
        if (front == null){ // 그 다음꺼 없다면.(큐 비어있음)
            rear = null;
        }
        return data;
    }

    public void printQueue(){
        printAll();
    }


}
