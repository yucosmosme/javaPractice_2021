package ch10;

public class BirthDay {

    /*
    * 접근 제어 지시자 (accesss modifier)
    클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
    private : 같은 클래스 내부에서만 접근 가능 ( 외부 클래스, 상속 관계의 클래스에서도 접근 불가)
    아무것도 없음 (default) : 같은 패키지 내부에서만 접근 가능 ( 상속 관계라도 패키지가 다르면 접근 불가)
    protected : 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
    public : 클래스의 외부 어디서나 접근 할 수 있음
    * */

    /*멤버변수는 private로 해야 클래스 밖에서 데이터 오용을 막을 수 있음.
    * 그대신 get, set을 통해 제대로 변경하게 .
    * 근데 유효한지 여부 확인하는 isValid()같은 경우는 set메서드는 제공하지 않음으로써
    * 외부에서 변경 불가능하게 할 수 있음. readOnly와 같은 개념이 됨.
    * */
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay(){
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day){
        this.day = day;
    }

    //유효여부확인 후 set
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.isValid = false;
        }
        else {
            this.isValid = true;
            this.month = month;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate(){
        if (isValid) {
            System.out.println(year + "년" + month + "월" + day + "일");
        }
        else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
