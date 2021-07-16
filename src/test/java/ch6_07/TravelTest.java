package ch6_07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

    public static void main(String[] args) {

        TravelCustomer travelCustomer1 = new TravelCustomer("Taem", 29, 100);
        TravelCustomer travelCustomer2 = new TravelCustomer("Minnie", 33, 100);
        TravelCustomer travelCustomer3 = new TravelCustomer("Ggong", 1, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(travelCustomer1);
        customerList.add(travelCustomer2);
        customerList.add(travelCustomer3);

        //고객 명단 출력
        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream().map(s -> s.getName()).forEach(n-> System.out.println(n));

        //여행 총 비용 계산
        //mapToInt()에서는 sum() 내장되어있음
        int total = customerList.stream().mapToInt(s->s.getPrice()).sum();
        System.out.println("총 여행 비용은 :" + total + "입니다");

        //고객 중 20세 이상인 사람의 이름을 정렬하여 출력
        customerList.stream().filter(s->s.getAge() >=20).map(n->n.getName()).sorted().forEach(i-> System.out.println(i));
    }

}
