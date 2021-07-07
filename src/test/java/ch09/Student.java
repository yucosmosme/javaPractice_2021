package ch09;

public class Student {
    int studentID;
    String studentName;

    //과목 인스턴스인데 여기서 선언해주고 밑에서 생성함
    Subject korea; //국어과목
    Subject math; //수학과목

    Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject(); //인스턴스 생성
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }
    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo(){
        int total = (korea.score + math.score)/2;
        System.out.println(studentName + "학생의 평균 점수는" + total + "입니다.");
    }
}
