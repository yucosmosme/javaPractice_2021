package ch18;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // company1과 2의 메모리가 같음을 알 수 있다.
        System.out.println(company1);
        System.out.println(company2);

        //즉, 싱글톤 패턴은
        //외부에서 생성할 수 없고 내부에서만 private으로 생성해놓고
        //내부에서 생성한 메소드로만 접근이 가능한 것.

        //이런식으로 날짜처럼 유일한 객체에 접근할때
        //싱글톤 패턴을 쓴다.
        Calendar calendar = Calendar.getInstance();
    }
}
