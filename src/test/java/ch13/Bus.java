package ch13;

public class Bus {

    int busNumber;
    int passengerCount; //승객수
    int money;

    //버스 생성자
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money += money; //수입 총액
        passengerCount++; //승객수
    }

    public void showBusInfo(){
        System.out.println(busNumber + "번 버스의 승객은" + passengerCount + "명이고 수입은 " + money + "원입니다.");
    }
}
