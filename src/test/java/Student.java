public class Student {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println( studentID + "학번 학생의 이름은 " + studentName + ". 사는 곳은 " + address);
    }

    // 겟 메서드. 클래스 안에 있는 함수.
    // 문자열을 반환
    public String getStudentName(){
        return studentName;
    }

    // set메서드. 반환값은 없어서 void.
    // 바꿀 데이터 값을 name으로 받아와서 studentName 값을 교체시킨다.
    public void setStudentName(String name){
        studentName = name;
    }
}

//이렇게 만든 메서드는 다른 class 파일 (studentTest.java)에서 테스트 해보기.