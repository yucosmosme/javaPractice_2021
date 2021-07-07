public class breakTest {

    public static void main(String[] args) {
        int sum = 0;
        int num;


        for (num = 1; ; num++){
            sum += num;
            // 조건에 맞으면 for 문 밖으로 빠져나옴
            if (sum >= 100) break;
        }

        System.out.println(sum);
        System.out.println(num);

        for (num = 1; num <= 100; num ++){
            //continue는 반복문 안에서 쓰는 조건문.
            //조건이 true이면 반복문 내부에 이후에 나오는 다른 수행문을 수행하지 않음
            //num 나누기 3의 나머지가 0이 아니면 , 즉 num이 3의 배수가 아니면 그 뒤의 내용(num 출력)은 건너뛴다.
            if ((num % 3) !=0) continue;
            System.out.println(num);
        }
    }
}
