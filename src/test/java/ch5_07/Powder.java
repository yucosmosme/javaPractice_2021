package ch5_07;

//상속
public class Powder extends Material{


    @Override
    public String toString() {
        return "재료는 파우더입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다");
    }
}
