package ch3_15;

//클래스와 인터페이스 모두 상속받을때
public class BookShelf extends Shelf implements Queue{


    //인터페이스에서 쓰여진 추상메소드 모두 구현함.
    @Override
    public void enQueue(String title) {
        //shelf는 Shelf.java (상위클래스)의 protected변수
        //여기서는 상속받았으므로 쓸수있다.
        //shelf는 arraylist이므로 거기에 속한 .add, .remove등의 메소드 사용가능
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
