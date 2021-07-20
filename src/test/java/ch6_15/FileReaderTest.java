package ch6_15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    /*
    * 15. 문자 단위 입출력 스트림

    * Reader
    문자 단위 입력 스트림 최상위 추상 클래스
    많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함

    주요 하위 클래스

    FileReader
    파일에서 문자 단위로 읽는 스트림 클래스입니다.

    InputStreamReader
    바이트 단위로 읽은 자료를 문자로 변환해주는 보조 스트림 클래스 입니다.

    BufferedReader
    문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공하는 보조 스트림입니다.


    주요 메서드

    * int read()
    파일로부터 한 문자를 읽습니다. 읽은 문자를 반환합니다.

    int read(char[] buf)
    파일로부터 buf 배열에 문자를 읽습니다.

    int read(char[] buf, int off, int len)
    파일로부터 buf 배열의 off 위치로부터 len 개수만큼의 문자를 읽습니다.

    void close()
    입력 스트림과 연결된 대상 리소스를 닫습니다.
    *
    * */

    public static void main(String[] args) {

        try {
            //FileInputStream :
            //파일에서 바이트 단위로 자료를 읽음 -> 한글 깨짐
//            FileInputStream fis = new FileInputStream("src/test/java/ch6_15/reader.txt");

            //FileReader
            //파일에서 문자 단위로 읽는 스트림 클래스입니다.
            //한글 안꺠짐
            FileReader fr = new FileReader("src/test/java/ch6_15/reader.txt");
            int i;
            while ((i = fr.read()) != -1){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
