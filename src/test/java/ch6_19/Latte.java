package ch6_19;

public class Latte extends Decorator{
    //데코리이터 상속받았으므로 커피 포함한것.

    //Decorator가 기본생성자 없으므로 상속받을때 상속자 명시적으로 호출해야 한다.
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println(" Adding Milk ");
    }
}
