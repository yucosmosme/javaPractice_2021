public class StudentTest {

    public static void main(String[] args) {

        // 첫번째 학생인스턴스 생성.
        Student studentLee = new Student();
        studentLee.studentID = 12345;
        //여기서는 set 메소드로 이름 셋팅
        studentLee.setStudentName("미니");
        studentLee.address = "seoul gangnam";

        studentLee.showStudentInfo();

        // 두번쨰 학생 인스턴스 생성
        Student studentKim  = new Student();
        studentKim.studentID = 3424;
        studentKim.address = "Bucheon";
        // 여기서는 그냥 studentName에 이름 대입
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();

        /**
         * 미니와 kim 객체를 생성하게 해준 클래스는 Student()로 동일.
         * 그러나 미니와 kim은 각각 서로 다른 메모리에 동적으로 할당받는다. ==> 힙메모리
         *
         * 아래와 같이 객체를 찍어보면
         * Student@2a139a55
         * Student@15db9742
         *
         * 와 같이 서로 다른 가상 주소에 할당된 것을 알 수 있다.
         *
         */

        System.out.println(studentKim);
        System.out.println(studentLee);

    }
}
