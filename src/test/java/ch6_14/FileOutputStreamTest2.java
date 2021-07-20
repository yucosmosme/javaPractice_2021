package ch6_14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) throws IOException {

        // java 9 부터 제공되는 기능
//        FileOutputStream fos = new FileOutputStream("src/test/java/ch6_14/output2.txt",true);
//        try(fos){
//
//            byte[] bs = new byte[26];
//            byte data = 65;        //'A' 의 아스키 값
//            for(int i = 0; i < bs.length; i++){  // A-Z 까지 배열에 넣기
//                bs[i] = data;
//                data++;
//            }
//
//            fos.write(bs);  //배열 한꺼번에 출력하기
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("출력이 완료되었습니다.");
    }
}
