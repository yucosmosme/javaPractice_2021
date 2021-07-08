package ch3_03;

public class CustomerTest {
    public static void main(String[] args) {
        //디폴트 생성자를 없앴으므로 직접 매개변수에 넣는다.
        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.setCustomerName("이순신"); //디폴트생성자 방식
//        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        //vip
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//        customerKim.setCustomerName("김유신"); //디폴트생성자방식
//        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        //이메서드는 Customer.java 꺼지만 VIPCUstomer 에서도 상속을 받아서 쓸수있다.
        System.out.println(customerKim.showCustomerInfo());

        //형변환:
        /*
        * 형 변환(업캐스팅)

        상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성
        Customer customerLee = new VIPCustomer();

        상위 클래스 타입의 변수에 하위 클래스 변수가 대입;
        VIPCustomer vCustomer = new VIPCustomer();
        addCustomer(vCustomer);
        int addCustomer(Customer customer){
        }

        하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능함

        상속 관계에서 모든 하위 클래스는 상위 클래스로 형 변환(업캐스팅)이 됨
        ( 그 역은 성립하지 않음)


        형 변환과 메모리

        Customer vc = new VIPCustomer(); 에서 vc가 가리키는 것은?

        VIPCustomer() 생성자에 의해 VIPCustomer 클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만,
        변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임
        * */



        //상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성함
        //여기서 cVip.으로 보면 상위 클래스인 customer가 가진 멤버변수에만 접근 가능.
        Customer cVip = new VIPCustomer(10030, "mini");


    }

}
