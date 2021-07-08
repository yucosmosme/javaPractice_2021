package ch3_02;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        //vip
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        //이메서드는 Customer.java 꺼지만 VIPCUstomer 에서도 상속을 받아서 쓸수있다.
        System.out.println(customerKim.showCustomerInfo());
    }

}
