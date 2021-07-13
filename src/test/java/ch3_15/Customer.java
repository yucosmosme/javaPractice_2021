package ch3_15;

public class Customer implements Buy, Sell{


    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    //Buy랑 Order의 defautl 메서드 이름이 같으므로 하나만 선택
    //아니면 재정의하면됨
    @Override
    public void order() {
//        Buy.super.order(); //Buy꺼로 선택
        System.out.println("재정의"); //재정의
    }

    //새로운 메소드
    public void sayHello() {
        System.out.println("Hello");
    }

}
