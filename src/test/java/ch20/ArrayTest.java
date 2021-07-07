package ch20;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i=0, num=1; i<arr.length; i++){
            arr[i] = num++;
            System.out.println(arr[i]);
        }

        //향상된 for문 - arr 배열을 포문을 돌면서 num으로 변수를 대입받음
        for(int num : arr){
            total += num; //하나씩 더함
        }

        System.out.println(total);

    }
}
