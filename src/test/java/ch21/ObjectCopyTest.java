package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {

        //System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드
        //
        //
        //얕은 복사
        //객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨
        //즉, 두 배열이 같은 객체를 가리킴


        Book[] library = new Book[5]; //원래배열
        Book[] copyLibrary = new Book[5]; //복사할배열

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        //배열 복사하는 방법 : 메모리 주소를 복사해준다.
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        //원래배열의 데이터 변경
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("====== library=========");

        for (Book book : library){
            System.out.println(book);
            book.showBookInfo();
        }

        System.out.println("====== copy library=========");
        for (Book book : copyLibrary){
            System.out.println(book);
            book.showBookInfo();
        }

        //이렇게 출력해 보면 복사된 배열과 원래 배열의 메모리 주소도 같음.
        //원래배열에서 변경된 데이터가 복사된 배열에서도 함께 변경됨.


    }
}
