package ch3_15;

import java.util.ArrayList;

public class Shelf {

    //같은 패키지나 상속관계의 클래스에서만 접근 가능
    protected ArrayList<String> shelf;

    public Shelf(){
        //생성자가 호출될 때 뉴하는게 나음. 위에 멤버변수에서 뉴하기보단.
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}
