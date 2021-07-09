package ch3_04;

public class CustomerTest {
    public static void main(String[] args) {

        //일반고객
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000); //1000원짜리 샀을떄 최종 결제 가격 - 일반 고객 할인 없음
        System.out.println(customerLee.showCustomerInfo() + price);

        //vip고객
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000); // vip 할인 후 결제 가격
        //이메서드는 Customer.java 꺼지만 VIPCUstomer 에서도 상속을 받아서 쓸수있다.
        System.out.println(customerKim.showCustomerInfo() + price);

        //상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성함
        //여기서 cVip.으로 보면 상위 클래스인 customer가 가진 멤버변수에만 접근 가능.

        Customer cVip = new VIPCustomer(10030, "mini");

        //그럼 메서드 호출시 상위클래스의 메서드가 호출될까
        //하위클래스의 오버라이딩된 메서드가 호출될까
        // --> 오버라이딩된 메서드 호출됨
        //(VIP의 10% 할인 적용된 가격 리턴)
        //변수타입은 일반고객이지만 인스턴스 타입은 VIP이기 때문.
        //이건 가상함수 방식.
        System.out.println(cVip.calcPrice(1000));

    }

}
