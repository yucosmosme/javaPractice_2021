package ch23;
import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {


        /*java.util 패키지에서 제공되는 hashSet
        기존의 배열 선언과 사용 방식은 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야 했음
        배열의 요소를 추가하거나 삭제하면 다른 요소들의 이동에 대한 구현을 해야 함
        hashSet는 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해 주는 클래스
        이미 많은 메서드들이 최적의 알고리즘으로 구현되어 있어 각 메서드의 사용 방법만 익히면 유용하게 사용할 수 있음
        */

        //<>이건 제네릭이라고 해서 어떤 객체를 넣을건지를 지정.
        ArrayList<Book> library = new ArrayList<Book>();
        //이렇게 생성자에서는 제네릭 안에 생략해도됨.
//        hashSet<Book> library = new hashSet<>();


        //기본으로 10개 생성해주는데 내가 추가하면 더 늘려줌
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        //int size(): 배열의 전체 개수 반환
        for (int i = 0; i<library.size(); i++){
            // E get(int index) : 배열의 index에 있는 요소 값을 반환.
            library.get(i).showBookInfo();
        }



    }
}
