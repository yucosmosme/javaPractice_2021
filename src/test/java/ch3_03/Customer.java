package ch3_03;

public class Customer {

    /*
    * 클래스 상속
하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨


new VIPCustomer()를 호출하면 Customer()가 먼저 호출 됨
* 클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출 함



*
    */

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    //기본생성자 없애고 매개변수 받는 생성자로 변경
    public Customer(int customerID, String customerName){
        customerGrade ="SILVER";
        bonusRatio = 0.01;

        //호출시 출력되는 로그:
        //이게 하위 클래스보다 먼저 호출된다.
        System.out.println("Customer(int, String) 생성자 호출");
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
