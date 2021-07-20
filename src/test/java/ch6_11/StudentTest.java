package ch6_11;

public class StudentTest {
    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();

        String name = null;
        try{
            Student student = new Student(name); //학생이름넣음

        }catch( StudentNameFormatException e ){ //학생이름 잘못되면
            myLogger.warning(e.getMessage()); //워닝로그 (널에러)
        }

        try{
            Student student = new Student("Edward Jon Kim Test");
        }catch ( StudentNameFormatException e){
            myLogger.warning(e.getMessage());  //이름 길다는 에러
        }

        Student student = new Student("James");

        String sName = student.getStudentName();

    }

}
