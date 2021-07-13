package ch5_06;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
//      System.out.println(powder); //"재료는 파우더입니다."

        //여기서 <> 타입 비워두면 Object로 인식하므로 나중에 갖다 쓸때 형변환해줘야함
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        //제네릭으로 쓰면 여기서 컴파일러가 다 powder로 형변환 시켜주기 때문에
        powderPrinter.setMaterial(powder); //"재료는 파우더입니다"를 넣음


        //Object로 가져오면 여기서 형변환 시켜줘야 했지만 제너릭은 아래와 같이 형변환 필요 없다.
        Powder p = powderPrinter.getMaterial();
        System.out.println(p);



    }
}
