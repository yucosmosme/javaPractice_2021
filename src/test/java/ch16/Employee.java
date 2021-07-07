package ch16;

public class Employee {

    /*
    * 여러 인스턴스에서 고통으로 사용하는 변수를 선언하자 - static 변수
    공통으로 사용하는 변수가 필요한 경우
    여러 인스턴스가 공유하는 기준 값이 필요한 경우
    학생마다 새로운 학번 생성
    카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
    회사에 사원이 입사할때 마다 새로운 사번이 필요한

    * static 변수 선언과 사용하기
    인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
    클래스 변수, 정적변수라고도 함(vs. 인스턴스 변수)
    인스턴스 생성과 상관 없이 사용 가능하므로 클래스 이름으로 직접 참조
    * */

    //serialNum 은 중요한 변수. 기준이 된다. -> private
    //여러 인스턴스간에 공유하는 값이므로 static으로 선언해서 클래스 이름으로 바로 호출 가능하게 한다.
    // ex. Employee.getSerialNum();
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        //사원 인스턴스가 생성될때마다 serialNum 증가시키고싶음
        //근데 serialNum은 static변수라 한사람이 증가시키면 다른사람도 같은 값을 가진다.
        // -> 증가시키고 멤바변수에 복사해주면 된다.
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {

        //static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 바로 호출 될 수 있음
        //그럼 인스턴스 생성 전에 이 메서드가 호출 될 수 있으므로
        // static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
        //ex. employeeName = "lee" 라고 쓸 수 없음.
        // 그냥 지역변수 int i = 0 ; 이런건 괜찮음
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
