package ch6_13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

//    표준 입출력 스트림 :
//    System.out
//    표준 출력(모니터) 스트림
//    System.out.println("출력 메세지");
//
//    System.in
//    표준 입력(키보드) 스트림
//    int d = System.in.read() // 한 바이트 읽기
//    System.err
//
//    표준 에러 출력(모니터) 스트림
//    System.err.println("에러 메세지");
//    System.in 사용하기 예제

    public static void main(String[] args) {
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

        int i;

//        try {
//            //얘는 한바이트씩 읽는거라 한글 입력하면 에러남.
//            while((i = System.in.read()) !='\n') { //읽어온 값이 엔터가 아닐때까지 입력문 출력
//                System.out.println(i); //바이트
//                System.out.println((char)i); //해당 문자로 변환
//            };
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {

            //얘는 system.in 표준입력스트림으로 바이트로 받아온걸 문자로 바꿔주기때문에 한글 출력 가능.
            //inputStreamReader: 바이트를 문자로 바꿔줌
            InputStreamReader isr = new InputStreamReader(System.in);

            while((i = isr.read()) !='\n') { //읽어온 값이 엔터가 아닐때까지 입력문 출력
                System.out.println(i); //바이트
                System.out.println((char)i); //해당 문자로 변환
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
