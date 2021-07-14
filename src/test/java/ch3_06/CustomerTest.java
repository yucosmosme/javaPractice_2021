package ch3_06;


import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        //여기서는 배열로 진행
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        //인스턴스 생성 : 생성은 각기 다른 클래스에서 하지만 변수타입은 다 상위클래스로지정했다.
        Customer Mini = new Customer(89, "mini");
        Customer jihun = new GoldCustomer(91, "지훈");
        Customer hae = new VIPCustomer(90, "해니", 12345); //상담원 id도 배정해야됨

        //생성한 인스턴스 배열에 추가
        customerList.add(Mini);
        customerList.add(hae);
        customerList.add(jihun);

        //루프 돌려서 메서드 실행
        for (Customer customer : customerList){
            int finalCost = customer.calcPrice(1000); //만원짜리 제품 구매시 할인 적용 후 최종 결제금액
            System.out.println(customer.showCustomerInfo() + ". 최종결제금액은 " + finalCost + "원 입니다.");

            //이러케해도됨
            System.out.println(customer.getCustomerName() +" 님이 " +  + finalCost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");

        }

    }

}
