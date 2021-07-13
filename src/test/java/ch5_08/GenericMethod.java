package ch5_08;

public class GenericMethod {

    //점 두개로 사각형 면적 구함
    //이와 같이 제네릭 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용 할 수 있음
    //public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수.....) { } 의 형태로 사용
    //꼭 static 아니어도됨. 얘는 밑에 static 메서드에서 가져다 쓰려고 써준거.
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right =((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height; //면적 리턴
    }

    public static void main(String[] args) {

        //제너릭이므로 앞에 x좌표는 정수형, y 좌표는 실수형으로 만들어봄.
        //뒤의 <>는 비워도 동일함.
        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
    }

}
