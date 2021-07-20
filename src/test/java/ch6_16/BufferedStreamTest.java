package ch6_16;

import java.io.*;
import java.net.Socket;

public class BufferedStreamTest {

    /*
    * BufferedInputStream과 BufferedOutputStream
    약 8k의 배열이 제공되어 입출력이 빠르게 하는 기능이 제공되는 보조 스트림
    BufferedReader와 BufferedWriter는 문자용 입출력 보조 스트림
    BufferedInputStream과 BufferedOutputStream을 이용하여 파일 복사하는 예
    * */
    public static void main(String[] args) {

        long millisecond = 0;
        try(FileInputStream fis = new FileInputStream("src/test/java/ch6_16/a.zip"); //a.zip 읽어와서
            FileOutputStream fos = new FileOutputStream("src/test/java/ch6_16/copy.zip"); //cop.zip 생성
            //그냥 한바이트씩 읽고 쓰면 느림
            //-> 버퍼 스트림으로 읽고 쓰면 빨라짐.
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            millisecond = System.currentTimeMillis(); //복사시작시간

            int i;
            while( ( i = bis.read()) != -1){ // a.zip 버퍼 읽음
                bos.write(i); //읽은 내용 copy.zip에 쓰기
            }

            millisecond = System.currentTimeMillis() - millisecond; //복사하는데 걸린 시간
        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");

        //소켓 활용 방법
        //소켓을 getInputStream으로 읽음
        //한글 처리를 위해 InputStreamReader로 감쌈
        //속도 향상을 위해 BufferedReader로 감쌈
        //보조스트림을 다른보조스트림으로 계속 감싸는 방식.
//        Socket socket = new Socket();
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            br.readLine();// 웹문서 등 new line으로 되어있을때 readLine()으로 읽으면 한줄한줄 읽을 수 있다.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
