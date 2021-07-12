package ch3_11;

//얘는 상속.
//Calculator에서 구현하지 않은 인터페이스의 추상메서드들을 구현.
//인터페이스의 타입인 Calculator를 "타입상속" 했다고 표현함.
//얘는 Calc.java의 타입이라고 할 수 있음.
public class CompleteCalc extends Calculator{

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return ERROR;
        return num1/num2;
    }

    //새로만듦
    public void showInfo(){
        System.out.println("모두 구현.");
    }
}
