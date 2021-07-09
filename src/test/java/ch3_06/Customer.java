package ch3_06;

public class Customer {


    /*
    * 07. 상속은 언제 사용 할까?

    IS-A 관계(is a relationship : inheritance)
    일반적인(general) 개념과 구체적인(specific) 개념과의 관계
    상위 클래스 : 하위 클래스보다 일반적인 개념 ( 예: Employee )
    하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐 ( 예: Engineer, Manager...)
    상속은 클래스간의 결합도가 높은 설계
    상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
    계층구조가 복잡하거나 hierarchy가 높으면 좋지 않음

    HAS-A 관계(composition)
    클래스가 다른 클래스를 포함하는 관계 ( 변수로 선언 )
    코드 재사용의 가장 일반적인 방법
    Student가 Subject를 포함하는
    Library를 구현할 때 ArrayList 생성하여 사용
    상속하지 않음
    * */

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    //기본생성자 - 다른 클래스에서 호출하지 않는경우 여기에서 셋팅
    public Customer()
    {
        initCustomer();
    }

    // 생성자 호출시 여기에서 아이디와 이름 셋팅
    public Customer(int customerID, String customerName){

        this.customerID = customerID;
        this.customerName = customerName;

        initCustomer();
    }

    // 등급 및 보너스율 셋팅
    private void initCustomer()
    {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    //일반고객: 할인은 없고 보너스만.
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는" + bonusPoint + "입니다";
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
}
