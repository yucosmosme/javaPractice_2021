public class Student2 {

    //얘네는 멤버변수라서 객체가 만들어질 떄 초기화 된다.
    public int studentNumber;
    public String studentName;
    public int grade;

    //constructor overloading. 생성자 오버로딩.
    public Student2(){}

    //생성자 : 반환값 없음
    // 내 멤버변수에다가 넘어온 값을 대입하고 싶음.
    public Student2(int studentNumber, String studentName, int grade){

        //왼쪽은 내 멤버변수. 오른쪽은 받아온 파라메터(매개변수)
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo(){
        return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + grade + "입니다.";
    }
}
