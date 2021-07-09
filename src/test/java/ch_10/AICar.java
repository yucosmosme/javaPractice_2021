package ch_10;

public class AICar extends Car{


    //추상메서드 구현
    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    //추상메서드 구현
    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }
}
