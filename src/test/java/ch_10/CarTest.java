package ch_10;

public class CarTest {

    public static void main(String[] args) {

        //인스턴스 생성
        Car aiCar = new AICar();
        //템플릿 메서드 호출
        aiCar.run();

        System.out.println("=================");

        //인스턴스 생성
        Car manualCar = new ManualCar();
        //템플릿 메서드 호출
        manualCar.run();
    }
}
