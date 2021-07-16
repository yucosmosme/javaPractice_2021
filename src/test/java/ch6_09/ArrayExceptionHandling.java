package ch6_09;


//모든 예외 클래스의 최상위 클래스는 Exception 클래스

public class ArrayExceptionHandling {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //ArrayExceptionHandling
        //배열 개수 넘어섬
        try {
            for(int i = 0; i <=5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        //try catch문이 있기 때문에 그 다음 라인도 실행이 되는겅임.
        System.out.println("here!!");
    }
}
