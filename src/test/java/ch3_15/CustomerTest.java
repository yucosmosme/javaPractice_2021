package ch3_15;

public class CustomerTest {

    public static void main(String[] args) {
        //CUstomer는 Buy, Sell 다 구현했으므로 걔네꺼 다 쓸수있음
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.sayHello();

        //customer를 buyer로 업캐스팅하면
        //buyer꺼만 쓸수있고 seller꺼는 못씀
        Buy buyer = customer;
        buyer.buy();
        //buyer.sell() 불가

        //customer를 Sell로 업캐스팅하면 seller꺼만 쓸수있음
        Sell seller = customer;
        seller.sell();
    }
}
