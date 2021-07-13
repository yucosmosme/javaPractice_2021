package ch4_02;

public class EqualTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        //동일한 값을 가진 학생 인스턴스 두개 생성
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        //주소값 복사(같은주소가리킴)
        Student std3 = std1;

        //std1과 std2는 서로 다른 인스턴스이므로 당연히 다름
        System.out.println(std1 == std2);

        //.equals()는 두 인스턴스의 주소 값을 비교하여 true/false를 반환
        //기본 equals()에서는 false를 반환하는데 ===> Student에서 Equals 재정의하였음: 주소값이 달라도 논리값만 같으면 true반환하도록
        System.out.println(std1.equals(std2));
        //std3은 std1의 주소값만 복사한것이므로 같은 true반환
        System.out.println(std1.equals(std3));

        //id는 동일하게 찍힘 (논리값 같음)
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        //실제 가상메모리값 출력: 서로 다름
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        //clone(): 생성이 아니라 객체를 그대로 복제함. 값 바뀌면 바뀐 상태대로 복제
        std1.setStudentName("Kim"); //원본 이름 변경
        Student copyStudent = (Student) std1.clone();
        System.out.println(System.identityHashCode(copyStudent)); //주소는 다름
        System.out.println(copyStudent); //변경된것 출력


    }
}
