package ch4_02;

// 해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 줌
public class Student implements Cloneable{

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String toString(){
        return studentName + "," + studentId;
    }

    //  equals() 메서드
    //두 인스턴스의 주소 값을 비교하여 true/false를 반환
    //재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현함
    //인스턴스가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의 할 수 있음
    //(같은 학번, 같은 사번, 같은 아이디의 회원...)
    //자동임포트 가능
    @Override
    public boolean equals(Object obj) {
        //넘어온 객체가 학생객체이면 학생객체로 다운캐스팅해줌.
        if(obj instanceof Student){
            Student std = (Student) obj;
            //논리적으로 같은 id값이면 true를 반환해줌
            if (this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    /*
    * clone() 메서드
    객체의 원본을 복제하는데 사용하는 메서드
    생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음.
    * 값이 바뀌면 바뀐것도 그대로 복사됨
    clone()메서드를 사용하면 객체의 정보(멤버 변수 값등...)가 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
    해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 줌
    * */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
