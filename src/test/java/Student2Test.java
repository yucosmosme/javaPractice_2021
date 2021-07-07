public class Student2Test {

    public static void main(String[] args) {

        //생성자가 없는 경우에만 디폴트 생성자가 제공된다. 그럼 아래 문장 쓸 수 있음.
        //그러나 내가 별도로 생성자 만든 경우에는 기본 생성자 제공되지 않아 밑에 문장 사용 불가 -> 내가 직접 기본 생성자를 만들어야 한다.
        Student2 studentLee = new Student2();

        // 출력값: null학생의 학번은0이고, 00입니다.
        // 변수값 지정하지 않은 경우 int는 0으로, String은 null로 자동 초기화됨
        System.out.println(studentLee.showStudentInfo());

        //생성자에 매개변수 3개 전달 (내가 만든 생성자)
        Student2 studentKim = new Student2(123456, "kim", 3);
        System.out.println(studentKim.showStudentInfo());

        //경우에 따라서는 디폴트 생성자를 제공하지 않는 경우도 있음.

    }
}
