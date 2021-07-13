package ch5_03;

public class MyLinkedList {

    /*
    * LinkedList 특징
    동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
    자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
    자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)
    연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)
    jdk 클래스 : LinkedList
    * */
    private MyListNode head; //연결리스트에서 맨앞에있는애
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    //맨뒤에 추가
    public MyListNode addElement( String data ) //data 새로 들어온 데이터
    {

        MyListNode newNode;
        if(head == null){  //맨 처음일때
            newNode = new MyListNode(data);
            head = newNode; //헤드에 넣음
        }
        else{ //헤드가 이미 있을때
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while(temp.next != null)  //맨 뒤로 가서 (next가 없을때까지 반복)
                temp = temp.next;
            temp.next = newNode; //마지막에 추가해줌
        }
        count++; //개수 추가
        return newNode;
    }

    //원하는 위치에 넣어줌
    public MyListNode insertElement(int position, String data )
    {
        int i;
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count ){
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞으로 들어가는 경우
            newNode.next = head;
            head = newNode;
        }
        else{
            MyListNode preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;

            }
            //위치조정
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞을 삭제하는
            head = tempNode.next;
        }
        else{
            MyListNode preNode = null;
            //preNode 찾고 tempNode 지움
            for(i=0; i<position; i++){ //삭제할 직전까지 for문을 돌고 나면 : tempNode는 삭제할 인덱스에 위치, preNode는 그 전 인덱스에 위치
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next; //preNode의 그 다음은 삭제할 인덱스 한칸 건너 뛰고 그 다음꺼가 됨
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode; //삭제할 노드 리턴
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  //맨 인 경우

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        } // for 문 다 돌고 나면 tempNode는 구할 인덱스의 값이 됨
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }


}
