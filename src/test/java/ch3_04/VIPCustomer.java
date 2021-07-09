package ch3_04;

public class VIPCustomer extends Customer {

    /*
    * 04. 메서드 재정의하기(overring)
    하위 클래스에서 메서드 재정의 하기
    오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
    하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
    VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음
    재정의 하여 구현해야 함
    * */
    private int agentID; //전문상담원
    double salesRatio; //할인비율

    //Customertest에서 매개변수 받아옴
    public VIPCustomer(int customerID, String customerName){


        //내가 만든 생성자만 있고 기본생성자가 없으므로 super를 명시해야 한다.
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        //호출시 출력되는 로그:
        //이게 상위 클래스보다 늦게 호출된다.
        System.out.println("VIPCustomer(int, String) 생성자 호출");


    }


    //매서드 재정의
    //오버라이드로 자동 임포트 가능
    @Override
    public int calcPrice(int price) {
        //보너스포인트 적립은 부모와 동일함
        bonusPoint += price * bonusRatio;
        //vip는 10% 가격도 할인해줘야 하므로 아래 내용 추가
        price -= (int)(price * salesRatio); //실수나오면 정수로 변환

        return price;
    }


    public int getAgentID(){

        return agentID;
    }
}
