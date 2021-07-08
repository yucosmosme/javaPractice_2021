package ch3_02;

public class Customer {

    /*
    * 클래스 상속
    새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능을 확장하여 클래스를 구현함
    이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할때 기존 클래스를 상속함

    * * extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음
    자바는 단일 상속(single inheritance)만을 지원함

    * * 상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
    하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
    *
    * */

    /*
    * 실습
    * 멤버십 시나리오
    회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과
    이보다 충성도가 높은 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함
    물품을 구매 할때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름
    여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
    멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기
    *
    * */

    /*
    *일반 고객(Customer) 클래스 구현
    고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
    일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
    * */

    //외부에서 정보 못보게 할려고 private. -> 상속관계에서도 못봄.
    // 하위클래스에서 접근 가능하도록 protected 로 바꿔준다.->
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade ="SILVER";
        bonusRatio = 0.01;
    }

    //일반고객: 할인은 없고 보너스만.
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    //protected 멤버에 대한 getter
    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    //protected 멤버에 대한 setter
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는" + bonusPoint + "입니다";
    }
}
