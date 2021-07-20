package ch6_14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args) {

        try {
            //파일 쓰는거는 파일이 없으면 생성해서 쓴다.
            //있으면 덮어씀
            FileOutputStream fos = new FileOutputStream("src/test/java/ch6_14/output.txt");
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
