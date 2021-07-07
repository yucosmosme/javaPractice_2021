package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        //kim의 serialNum을 증가시켰지만 아래에서 출력해보면
        //lee와 kim 모두의 serialNum이 증가됨
        //즉 static은 인스턴스가 공유하는 변수.같은 메모리주소를 참조한다.
        //
        System.out.println(employeeLee.getEmployeeName() + "님의 사번은" +  employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은" +  employeeKim.getEmployeeId());
    }


}
