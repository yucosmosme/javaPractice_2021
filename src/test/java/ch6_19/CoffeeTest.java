package ch6_19;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee ethiopian = new Ethiopian();
        ethiopian.brewing();

        System.out.println();
        Coffee ethopianLatte = new Latte(ethiopian);
        ethopianLatte.brewing(); //이티오피아에 우유 추가됨

        Coffee mochaEthiopeanLatte = new Mocha(ethopianLatte);
        mochaEthiopeanLatte.brewing(); //이티오피아 우유 모카

        Coffee kenyaCoffee = new WhippedCream(new Mocha(new Latte(new Kenya())));
        kenyaCoffee.brewing();
    }
}
