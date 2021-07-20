package ch6_18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    //RandomAccessFile 클래스
    //입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스
    //파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
    //다양한 메서드가 제공됨
    //얘는 포인터 이동해서 읽고 쓰기 위함. 스트림은 파일을 읽고 쓰기 위함.

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("src/test/java/ch6_18/random.txt", "rw");
        rf.writeInt(100); //4바이트 (3+ 빈공간용1)
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeDouble(3.14); //8바이트
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeUTF("안녕하세요"); //한글은 3바이트 * 5 + null 2바이트 =17
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());

        rf.seek(0); //포인터 맨 앞으로 이동
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());

        //포인터가 맨 뒤에 있는데 얘네 읽으라그러면 오류나므로 -> .seek()로 맨 앞으로 이동시킴
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
