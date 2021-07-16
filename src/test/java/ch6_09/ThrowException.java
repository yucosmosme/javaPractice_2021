package ch6_09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException{

    //예외 발생 부분에서 throws 처리
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowException test = new ThrowException();
        try {
            //사용하는 부분에서 try catch로 throw 받아서 처리
            test.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
