package ch6_16;

import java.io.*;

public class DataStreamTest {

    /*
    * DataInputStream과 DataOutputStream
    자료가 메모리에 저장된 상태 그대로 읽거나 쓰는 스트림
    * 이미 자료가 있을때 처리
    DataInputStream 메서드
    * */
    public static void main(String[] args) {


        try(FileOutputStream fos = new FileOutputStream("src/test/java/ch6_16/reader.txt");
            DataOutputStream dos = new DataOutputStream(fos))
        {
            //쓰기
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("src/test/java/ch6_16/reader.txt");
            DataInputStream dis = new DataInputStream(fis))
        {
            //읽기
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
