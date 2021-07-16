package ch6_09;

public class AutoCloseTest {

    public static void main(String[] args) {

     AutoCloseable obj = new AutoClosableObj();

     //이렇게 autoclosable 사용하면 코드가 깔끔해짐.

//     try(obj){ //여기선 자바7 아니라서 제공 안됨
//         throw new Exception(); //예외 강제 발생 테스트
//     }catch (Exception e){//모든 익셉션 다 받아옴
//         System.out.println("exception");
//     }
    }
}
