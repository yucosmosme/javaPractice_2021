package ch21;

public class ObjectCopyTest2 {

    //깊은 복사
    //각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
    public static void main(String[] args) {

        Book[] library = new Book[5]; //원래배열
        Book[] copyLibrary = new Book[5]; //복사할배열

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        //깊은복사하려면 하나씩 일일이 넣어야됨
        for (int i = 0; i<library.length; i++){
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        //원래 배열의 데이터 변경 후 밑에서 찍어보면 - 복사한 데이터의 값은 변하지 않음.
        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("======library=========");
        for( Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");
        for( Book book : copyLibrary) {
            book.showBookInfo();
        }

    }
}
