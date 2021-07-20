package ch6_14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

    //파일의 끝까지 한 바이트씩 자료 읽기
    public static void main(String[] args) {
        int i;
        try {
            FileInputStream fis = new FileInputStream("src/test/java/ch6_14/input.txt");
            while ((i = fis.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

