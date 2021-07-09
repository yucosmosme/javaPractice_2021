package ch3_06;

//일반회원 클래스 상속
public class GoldCustomer extends Customer{

    //customer에서는 정의 안된 변수 정의
    double salesRatio;

    //customer는 디폴트생성자 없으므로 직접 호출해야함.
    public GoldCustomer(int customerID, String customerName){

        //이것도 필수
        super(customerID, customerName);

        //customer와는 다른 내용이므로 재정의
        customerGrade = "Gold";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    //매서드 재정의
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) price * salesRatio;
        return price;
    }
}
