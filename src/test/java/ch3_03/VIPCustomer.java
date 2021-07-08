package ch3_03;

public class VIPCustomer extends Customer {

    private int agentID; //전문상담원
    double salesRatio; //할인비율

    //Customertest에서 매개변수 받아옴
    public VIPCustomer(int customerID, String customerName){

        /*
        super() :
        * 하위 클래스에서 가지는 상위 클래스에 대한 참조 값
        super()는 상위 클래스의 기본 생성자를 호출 함

        하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출 됨
        컴파일러가 super()를 자동으로 넣어줌. 직접 쓸 일은 거의 없음
        ( 이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함)

        상위 클래스의 기본 생성자가 없는 경우 ( 다른 생성자가 있는 경우 ) 하위 클래스에서는 생성자에서는 super를 이용하여
        명시적으로 상위 클래스의 생성자를 호출 함
        super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있음
        *
        super()는 상위클래스 인스턴스의 참조값을 가지게됨. this.처럼 생성자 호출 가능.

        */

        //내가 만든 생성자만 있고 기본생성자가 없으므로 super를 명시해야 한다.
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        //호출시 출력되는 로그:
        //이게 상위 클래스보다 늦게 호출된다.
        System.out.println("VIPCustomer(int, String) 생성자 호출");


    }

    public int getAgentID(){

        return agentID;
    }
}
