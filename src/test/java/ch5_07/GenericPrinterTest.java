package ch5_07;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        // new Powder() 하면 toString()으로 된 "재료는 파우더입니다"반환
        // -> .setMaterial()로 material에 저장
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 꺼내옴. 형변환 하지 않음
        System.out.println(powderPrinter); //"재료는 파우더입니다" 출력.
        powder.doPrinting();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);
        plastic.doPrinting();

        //water는 material 상속받지 않았으므로 제네릭 사용 불가
//	    GenericPrinter powderPrinter2 = new GenericPrinter();
//		powderPrinter2.setMaterial(new Powder());
//		Powder powder = (Powder)powderPrinter.getMaterial();
//		System.out.println(powderPrinter);
//      GenericPrinter<Water> printer = new GenericPrinter<Water>();

    }
}
