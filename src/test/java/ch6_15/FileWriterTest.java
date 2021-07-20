package ch6_15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    /*
    * Writer
    문자 단위 출력 스트림 최상위 추상 클래스
    많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함

    * 주요 하위 클래스

    FileWriter
    파일에서 문자 단위로 출력하는 스트림 클래스입니다.

    OutputStreamWriter
    바이트 단위의 자료를 문자로 변환해 출력해주는 보조 스트림 클래스 입니다.

    BufferedWriter
    문자로 쓸 때 배열을 제공하여 한꺼번에 쓸 수 있는 기능을 제공하는 보조 스트림입니다.


    주요 메서드

    int write(int c)
    한 문자를 파일에 합니다.

    int write(char[] buf)
    문자 배열 buf의 내용을 출력합니다.

    int write(char[] buf, int off, int len)
    문자 배열 buf의 off위치에서부터 len 개수의 문자를 출력합니다.

    int write(String str)
    문자열 str을 출력합니다.

    int write(String str, int off, int len)
    문자열 str의 off번째 문자로부터 len 개수만큼 출력합니다.

    int flush()
    출력하기 전에 자료가 있는 공간(출력 버퍼)을 비워 출력하도록 합니다

    void close()
    스트림과 연결된 리소스를 닫습니다. 출력 버퍼도 비워집니다.
    * */
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("src/test/java/ch6_15/writer.txt")){
            fw.write('A');    // 문자 하나 출력

            char buf[] = {'B','C','D','E','F','G'};
            fw.write(buf); //문자 배열 출력

            fw.write("안녕하세요. 잘 써지네요"); //String 출력

            fw.write(buf, 1, 2); //문자 배열의 일부 출력 (B,C,D,E,F,G)에서 1번째 C부터 2개 출력

            fw.write("65");  //숫자를 그대로 출력
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
