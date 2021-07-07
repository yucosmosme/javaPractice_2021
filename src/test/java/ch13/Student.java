package ch13;

public class Student {

    /*
    * James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
    James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
    Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
    두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.

    * */
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    //학생이 버스를 탈떄
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    //학생이 지하철을 탈떄
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println(studentName+"님의 돈은"+money+"원입니다.");
    }
}
