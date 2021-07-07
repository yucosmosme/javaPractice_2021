package ch13;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000); //제임스가 가진 돈.
        Student studentT = new Student("Thomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus100); //제임스가 버스타면 잔액 4000원, 버스의 수입은 1000원.
        studentT.takeSubway((subwayGreen));

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}
