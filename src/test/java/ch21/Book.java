package ch21;

public class Book {

    //객체 배열 선언과 구현
    //
    //기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당되지만,
    //객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 함

    private String title;
    private String author;

    //기본생성자
    public Book(){}

    //생성자
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(title+","+author);
    }
}
