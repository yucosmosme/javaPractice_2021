package ch6_14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    //파일의 끝까지 한 바이트씩 자료 읽기
    public static void main(String[] args) {

        int i;
//        try {
//            FileInputStream fis = new FileInputStream("src/test/java/ch6_14/input.txt");
//
//            byte[] bs = new byte[10]; //바이트 10개 들어갈 자리 만듦
//
//            while ((i = fis.read(bs)) != -1) { //파일에서 10개씩 루프
//                for (int ch : bs){
//                    System.out.println((char)ch); //바이트 문자로 출력
//                    //근데 마지막 루프에서는 6개인데 10개 출력됨.
//                    //그 전 루프에서 저장되었던 남아있는 자료들이 덮어씌지 않아서 남아서 같이 출력된것.
//                }
//                System.out.println(":" + i + "바이트 읽음");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileInputStream fis = new FileInputStream("src/test/java/ch6_14/input.txt");

            byte[] bs = new byte[10]; //바이트 10개 들어갈 자리 만듦

            while ((i = fis.read(bs)) != -1) { //파일 읽어서 바이트 10자리에 채움. 10자리 꽉찰때마다 루프 돈다.
                for (int j=0; j<i; j++){ //i는 자릿수 리턴 -> 6자리수바께없으면 6자릿수만 출력시킬 수 있다.
                    System.out.println((char)bs[j]);
                }
                System.out.println(":" + i + "바이트 읽음");
            }

            // (bs,1,9)는 1부터 9까지만 읽겠다는 뜻 -> 9개만 읽음
            /*while ( (i = fis.read(bs, 1, 9)) != -1){
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "바이트 읽음" );
			}*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

