package ch6_19;

//상속용 -> abstract
//우유, 모카, 크림 등
public abstract class Decorator extends Coffee{

    Coffee coffee;

    //생성자
    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
