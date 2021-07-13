package ch4_01;

class Book{

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    //toString: 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
    // -> 객체 그냥 출력하면 메모리주소찍힘
    //toString으로 바꿔줘야 내부 데이터가 문자열로 찍힘
    @Override
    public String toString() {
        return title + "," + author;
    }

}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");


        System.out.println(book);
    }
}
