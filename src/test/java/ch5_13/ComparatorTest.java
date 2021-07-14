package ch5_13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//내가 내림차순으로 함수 만든것.
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        //.compareTo():
        /*
        * - compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다.
        compareTo() 함수에는 위에서 설명하는바와 같이 "문자열의 비교" 와 "숫자의 비교" 두 방식이 존재한다.
        숫자의 비교 같은 경우는 단순히 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴해주는 반면
        * 문자열의 비교 같은 경우는 같다(0), 그 외 양수/음수값 같이 참 재미난 결과를 반환해준다.
        *
        String str = "abcd";

        // 1) 비교대상에 문자열이 포함되어있을 경우
        System.out.println( str.compareTo("abcd") );  // 0 (같은 경우는 숫자나 문자나 0을 리턴)
        System.out.println( str.compareTo("ab") );  //  2
        System.out.println( str.compareTo("a") );  //  3
        System.out.println( str.compareTo("c") );  //  -2
        System.out.println( "".compareTo(str) );  //  -4

        // 2) 비교대상과 전혀 다른 문자열인 경우
        System.out.println( str.compareTo("zefd") );  //  -25
        System.out.println( str.compareTo("zEFd") );  //  -25
        System.out.println( str.compareTo("ABCD") );  //  32
        *
        str.compareTo("ab") 값이 왜 2라는 값이 나올까?
        이유는 "abcd" 에 "ab" 가 포함되어있으면 즉, 기준값에 비교대상이 포함되어있을 경우
        서로의 문자열 길이의 차이값을 리턴해주기 때문이다.
        * */

        return (o1.compareTo(o2))*-1; //내림차순
//        return (o1.compareTo(o2)); //오름차순 (얘는 원래의 String 방식과 동일)
    }
}

public class ComparatorTest{

    public static void main(String[] args) {
        //String은 이미 comparable이 내장되어 있어서 오름차순으로 구현되어있음
        // 그거 말고 다른 방식으로 정렬하고 싶으면
        //Treeset을 new 할 때 매개변수로 내가 직접 만든 정렬함수를 넣으면 됨.
        Set<String> set = new TreeSet<String>(new MyCompare());
        set.add("AA");
        set.add("tae");
        set.add("aa");
        set.add("ggoong");

        //add는 아무렇게나 했어도 저장은 내림차순대로 저장되어 출력할때도 내림차순으로 출력
        System.out.println(set);

    }
}
