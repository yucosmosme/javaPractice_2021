package ch6_09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {
        FileInputStream fis = null;

        //이런식으로  try catch 추가하다보면 코드가 너무더러워짐
        //--> finally를 붙여줘야함.
//        try {
//            fis = new FileInputStream("a.txt"); //파일 없을 수 있으니까 try catch로 감싼다.
//            System.out.println("read"); //여기서 에러난거라 이건 출력안됨
//            try {
//                fis.close(); //파일 닫을때도 try catch로 감싼다.
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("end");


        /*
        *
        *try-catch-finally 문
        finally 블럭에서 파일를 닫거나 네트웍을 닫는 등의 리소스 해제 구현을 함
        try{} 블럭이 수행되는 경우, finally{} 블럭은 항상 수행 됨
        여러 개의 예외 블럭이 있는 경우 각각에서 리소스를 해제하지 않고 finally 블록에서 해제하도록 구현함
        컴파일러에 의해 예외가 처리 되는 예 (파일 에러 처리)
        *
        * 근데 아래 코드도 여전히 지저분함 -> try-with-resources가 나옴
         * */

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            //return;
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행 됩니다.");
        }
        System.out.println("여기도 수행됩니다.");


    }
}
